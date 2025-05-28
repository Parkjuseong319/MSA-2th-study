package edu.kosa.dao.di;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;

import edu.kosa.model.UserVO;

public class UserDAO {
	
	@Autowired
	private ConnectionMaker connectionMaker; //has - a
	
	// 사용(DML명령어)
		// insert
		public void insert(UserVO vo) throws Exception{
			Connection conn = connectionMaker.makeConnection();		// db connect
			String sql = "INSERT INTO USERS(ID, NAME, PASSWORD) VALUES(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getPassword());
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "개 입력 성공");
			pstmt.close();
			conn.close();
		}
		// selectAll
		public void selectAll() {
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			
			try {
				conn = connectionMaker.makeConnection();
				stmt = conn.createStatement();
				rs = stmt.executeQuery("SELECT * FROM USERS");
				
				while(rs.next()) {
					String id = rs.getString("id");
					String name = rs.getString("name");
					String password = rs.getString("password");
					
					System.out.println(id + "\t" + name + "\t" + password);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try { rs.close(); stmt.close();
				} catch (SQLException e2) { e2.printStackTrace(); }
			}
		}
		// selectById
		
		// update
		
		// delete
		
		// menu
		public void menu() {
			System.out.println("선택하세요: \n1.Insert");
			System.out.println("2.SelectAll \n3. SelectById \n4. update \n5. delete");
		}
}
