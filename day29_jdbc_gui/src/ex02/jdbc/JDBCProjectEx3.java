package ex02.jdbc;

import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import dbConn.util.ConnectionHelper;

public class JDBCProjectEx3 extends JFrame implements ActionListener{
	//component 객체 선언
	JPanel panWest, panSouth;  //왼쪽텍스트필드, 아래쪽 버튼
	JPanel p1,p2,p3,p4,p5; 
	JTextField txtNo, txtName, txtEmail, txtPhone;
	JButton  btnTotal, btnAdd, btnDel, btnSearch, btnCancel, btnUpdate;
	
	JTable table; //검색과 전체 보기를 위한 테이블 객체 생성
	//상태변화를 위한 변수 선언
	private static final int NONE = 0;
	private static final int ADD = 1;
	private static final int DELETE = 2;
	private static final int SEARCH = 3;
	private static final int TOTAL = 4;
	private static final int UPDATE = 5;
	int cmd = NONE;
	
	MyModel model;	// user class
	
	public JDBCProjectEx3(){	
		//component 등록
		panWest = new JPanel(new GridLayout(5, 0));
		p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("번    호"));
		p1.add(txtNo = new JTextField(12));
		panWest.add(p1);
		
		p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JLabel("이    름"));
		p2.add(txtName = new JTextField(12));
		panWest.add(p2);
		
		p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(new JLabel("이  메  일"));
		p3.add(txtEmail = new JTextField(12));
		panWest.add(p3);
		
		p4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p4.add(new JLabel("전화번호"));
		p4.add(txtPhone = new JTextField(12));
		panWest.add(p4);
		
		p5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p5.add(new JLabel(""));
		panWest.add(p5);
		
		add(panWest, "West");
		
		//button 화면 아래 등록
		panSouth = new JPanel();
		panSouth.add(btnTotal= new JButton("전체보기")); 
		panSouth.add(btnAdd= new JButton("추     가"));
		panSouth.add(btnDel= new JButton("삭     제"));
		panSouth.add(btnSearch= new JButton("검     색"));
		panSouth.add(btnUpdate= new JButton("수     정"));
		panSouth.add(btnCancel= new JButton("취     소"));
		add(panSouth, "South");
		
		//event 처리
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		btnUpdate.addActionListener(this);
		
		//테이블 객체 생성
		add(new JScrollPane(table = new JTable()), "Center");
		//close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//메인 창 출력
		setBounds(100, 100, 700, 300); //setSize(W,H);   pack(); 
		setVisible(true);		
		
		dbConnect();   // db 연결
		
		total();		// 화면에 바로 보여주기 위함
	} //constructor end
	
	// db setting
	Connection conn;
	Statement stmt;
	PreparedStatement pstmtInsert, pstmtDelete, pstmtUpdate;
	PreparedStatement pstmtTotal, pstmtTotalScroll;
	PreparedStatement pstmtSearch, pstmtSearchScroll;
	
	private String sqlInsert = "INSERT INTO CUSTOMERS VALUES(?,?,?,?)";
	private String sqlDelete = "DELETE FROM CUSTOMERS WHERE CODE=?";
	private String sqlSelect = "SELECT * FROM CUSTOMERS";
//	private String sqlSearch = "SELECT * FROM CUSTOMERS WHERE NAME =?";
	private String sqlSearch = "SELECT * FROM CUSTOMERS WHERE NAME LIKE ?";
	private String sqlUpdate = "UPDATE CUSTOMERS SET NAME = ?, EMAIL = ?, PHONE = ? WHERE CODE=?";
	
	public void dbConnect() {
		try {
			conn = ConnectionHelper.getConection("oracle");
			pstmtInsert = conn.prepareStatement(sqlInsert);
			pstmtDelete = conn.prepareStatement(sqlDelete);
			pstmtTotal = conn.prepareStatement(sqlSelect);
			pstmtSearch = conn.prepareStatement(sqlSearch);
			pstmtUpdate = conn.prepareStatement(sqlUpdate);
			
			pstmtTotalScroll = conn.prepareStatement(sqlSelect, 
										ResultSet.TYPE_SCROLL_SENSITIVE, // 커서 이동을 자유롭게 하고 업데이트 내용을 반영한다.
										ResultSet.CONCUR_UPDATABLE);	// resultset object의 변경이 가능 <=> CONCUR_READ_ONLY

			pstmtSearchScroll = conn.prepareStatement(sqlSearch, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			System.out.println("connection success!");
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {	// 버튼 이벤트 처리
		Object obj = e.getSource();
		if( obj == btnAdd ){
			if( cmd != ADD ){
				setText(ADD);  //user method
				return;
			} //if in
			setTitle(e.getActionCommand());
			add();  //추가
			
		}else if( obj == btnDel ){
			if( cmd != DELETE ){
				setText(DELETE);  //user method
				return;
			} //if in
			setTitle(e.getActionCommand());
			del();  //삭제
			
		}else if( obj == btnSearch ){
			if( cmd != SEARCH ){
				setText(SEARCH);  //user method
				return;
			} //if in
			setTitle(e.getActionCommand());
			search();  //검색
			
		}else if( obj == btnUpdate){
			if( cmd != UPDATE ){
				setText(UPDATE);  //user method
				return;
			} //if in
			setTitle(e.getActionCommand());
			update();  //수정
			
		}else if( obj == btnTotal ){
			setTitle(e.getActionCommand());
			total();  //전체보기
		}
		setText(NONE);
		init(); //초기화 메소드, user method
	}// actionPerformed end

	
	// button event 처리 /////////////////////////////
	public void add() {		// insert
		try {
			String strNo = txtNo.getText();
			String strName = txtName.getText();
			String strEmail = txtEmail.getText();
			String strPhone = txtPhone.getText();
//			System.out.println(strNo + ", " + strName + ", " + strEmail + ", " + strPhone );
			
//			if (strNo.length() < 1 || strName.length() < 1) {
//				JOptionPane.showMessageDialog(null, "번호와 이름은 필수사항입니다. 입력해주세요");
//				return;
//			}
			
			switch (JOptionPane.showConfirmDialog(null, 
					"(" + strNo+", " + strName + ", " + strEmail + ", " + strPhone +")", 
					"추가하시겠습니까?", JOptionPane.YES_NO_OPTION)) {
			case 0: {	// 확인
				
				break;
			}
			case 1: //아니오
				return;		// return 함으로 다시 수정할 기회를 준다.
			}
			
			pstmtInsert.setInt(1, Integer.parseInt(strNo));
			pstmtInsert.setString(2, strName);
			pstmtInsert.setString(3, strEmail);
			pstmtInsert.setString(4, strPhone);
			pstmtInsert.executeUpdate();	// 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "추가됐습니다.");
		
		init();
	}		// add() end

	public void del() {
		String strNo = txtNo.getText();
		
		try {
		if(strNo.length() < 1) {
			JOptionPane.showMessageDialog(null, "삭제 시 코드번호 필수입력해야합니다");
			return;
		}
		
		switch (JOptionPane.showConfirmDialog(null, 
				"CODE: " + strNo, 
				"삭제하시겠습니까?", JOptionPane.YES_NO_OPTION)) {
		case 0: {	// 확인
			break;
		}
		case 1: //아니오
			return;		// return 함으로 다시 수정할 기회를 준다.
		}
		
			pstmtDelete.setInt(1, Integer.parseInt(strNo));
			pstmtDelete.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "삭제됐습니다.");
		init();
		total();
	}
	
	public void update() {
		try {
			String strNo = txtNo.getText();
			String strName = txtName.getText();
			String strEmail = txtEmail.getText();
			String strPhone = txtPhone.getText();
			
			switch (JOptionPane.showConfirmDialog(null, 
					"(" + strNo+", " + strName + ", " + strEmail + ", " + strPhone +")", 
					"수정하시겠습니까?", JOptionPane.YES_NO_OPTION)) {
			case 0: {	// 확인
				break;
			}
			case 1: //아니오
				return;		// return 함으로 다시 수정할 기회를 준다.
			}
			
			pstmtUpdate.setInt(4, Integer.parseInt(strNo));
			pstmtUpdate.setString(1, strName);
			pstmtUpdate.setString(2, strEmail);
			pstmtUpdate.setString(3, strPhone);
			pstmtUpdate.executeUpdate(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "수정됐습니다.");
		
		init();
	}

	public void total() {	// 전체보기(select all) 버튼 이벤트 처리 함수
		try {
			ResultSet rs = pstmtTotal.executeQuery();
			ResultSet rsScroll = pstmtTotalScroll.executeQuery();
			
			if( model == null ) model = new MyModel();		// 객체 생성, 메모리할당, 생성자 함수 자동 호출
			
			model.getRowCount(rsScroll);
			model.setData(rs);
			
//			table.setModel(model);
			table.setModel(new DefaultTableModel(model.data, model.columnName));
			table.updateUI();	// 스크롤 내릴 때 화면에 다시 그려주는 메서드
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}	// total() end
	
	public void search() {
		String strName = txtName.getText();
		
		if(strName.length() < 1) {
			JOptionPane.showMessageDialog(null, "이름은 필수입력해야합니다");
			return;
		}
		try {
			pstmtSearchScroll.setString(1, "%" + strName + "%");
			ResultSet rsScroll = pstmtSearchScroll.executeQuery();
			
			pstmtSearch.setString(1, "%"+strName+"%");
			ResultSet rs = pstmtSearch.executeQuery();
			
			if( model == null) model= new MyModel();
			
			model.getRowCount(rsScroll);
			model.setData(rs);
			
			table.setModel(new DefaultTableModel(model.data, model.columnName));
			table.updateUI();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	//search() end
//////////////////////////////////////////////

	private void init() {  //초기화 메소드
		txtNo.setText("");			txtNo.setEditable(false);
		txtName.setText("");		txtName.setEditable(false);
		txtEmail.setText("");		txtEmail.setEditable(false);
		txtPhone.setText("");		txtPhone.setEditable(false);
	}// init() end

	private void setText(int command) {
		switch(command){
			case ADD :
			case UPDATE:
				txtNo.setEditable(true);
				txtName.setEditable(true);
				txtEmail.setEditable(true);
				txtPhone.setEditable(true);
				break;
			case DELETE :
				txtNo.setEditable(true);
				break;
			case SEARCH :
				txtName.setEditable(true);
				break;
		}//switch end
		
		setButton(command);  //user method
	}// setText() end

	private void setButton(int command) {
		//cancel button 제외하고 어떤 버튼이 눌리더라도 모든 버튼이 비활성화
		btnTotal.setEnabled(false);
		btnAdd.setEnabled(false);
		btnDel.setEnabled(false);
		btnSearch.setEnabled(false);
		btnUpdate.setEnabled(false);
		
		switch(command){
			case ADD :
				btnAdd.setEnabled(true);
				cmd = ADD;
				break;
			case DELETE :
				btnDel.setEnabled(true);
				cmd = DELETE;
				break;
			case UPDATE:
				btnUpdate.setEnabled(true);
				cmd = UPDATE;
				break;
			case SEARCH :
				btnSearch.setEnabled(true);
				cmd = SEARCH;
				break;
			case TOTAL :
				btnTotal.setEnabled(true);
				cmd = TOTAL;
				break;
			case NONE :
				btnTotal.setEnabled(true);
				btnAdd.setEnabled(true);
				btnDel.setEnabled(true);
				btnUpdate.setEnabled(true);
				btnSearch.setEnabled(true);
				btnCancel.setEnabled(true);  //
				cmd = NONE;
				break;
		}//switch end	
	}//setButton end

	public static void main(String[] args) {
		new JDBCProjectEx3();
	}
}




