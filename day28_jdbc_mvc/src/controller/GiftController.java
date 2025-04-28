package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.GiftVO;

public class GiftController { // controller : ~DAO

	// 연결, 삽입, 삭제, 수정, 검색
	static Scanner sc = new Scanner(System.in);
	static PreparedStatement ps;
	static Statement stmt;
	static ResultSet rs;
	static Connection conn;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// connect
	public static void connect() {
		try {
			conn = ConnectionHelper.getConection("oracle");
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // auto commit off
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end connect

	// close
	public static void close() {
		try {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(ps);
			CloseHelper.close(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// menu
	public static void menu() throws SQLException, IOException {
		GiftVO vo = new GiftVO();

		while (true) {
			System.out.println();
			ConnectionHelper.menu();

			switch (sc.nextInt()) {
			case 0:
				System.out.println("Commit 하시겠습니까? (Y/N)");
				System.out.println("안하시려면 Rollback 됩니다.");
				if (sc.next().equalsIgnoreCase("Y")) {
					conn.commit();
					selectAll(vo.getClassName());
				} else {
					conn.rollback();
					selectAll(vo.getClassName());
				}
				break;
			case 1:
				selectAll(vo.getClassName());
				break;
			case 2:
				insert();
				selectAll(vo.getClassName());
				break;
			case 3:
				update(vo.getClassName());
				break;
			case 4:
				delete(vo.getClassName());
				break;
			case 5:
				selectByGno(vo.getClassName());
				break;
			case 6:
				close();
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			case 7:
				conn.commit();
				System.out.println("성공적으로 commit");
				break;
			} // end switch
		} // end while
	}

	// select all
	public static void selectAll(String className) throws SQLException {
		String sql = "SELECT * FROM " + className;
		rs = stmt.executeQuery(sql);

		ResultSetMetaData rsmd = rs.getMetaData(); // 해당 테이블에 대한 정보
		int count = rsmd.getColumnCount();

		while (rs.next()) {
			for (int i = 1; i <= count; i++) { // 각 타입별로 출력하기

				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + " ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + " ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + " ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + " ");
					break;

				default:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					break;
				} // end switch
			} // end for
			System.out.println();
		} // end while
	}

	// insert
	public static void insert() throws SQLException {
		 System.out.print("GNO : ");            String gno = sc.next();
	        System.out.print("GNAME : ");        String gname = sc.next();
	        System.out.print("G_START : ");    String g_start = sc.next();
	        System.out.print("G_END : ");        String g_end = sc.next();

	        try {
	            ps = conn.prepareStatement("INSERT INTO GIFT VALUES( ?, ?, ?, ? )");
	            ps.setString(1,  gno);
	            ps.setString(2,  gname);
	            ps.setString(3,  g_start);
	            ps.setString(4,  g_end);

	            int result = ps.executeUpdate();   //

	            System.out.println(result + "개 데이터가 추가 되었습니다.");
	        } catch (Exception e) {  e.printStackTrace();  }
	}

	// delete
	public static void delete(String className) throws SQLException, IOException {
		selectAll(className);
		System.out.println("삭제할 상품의 번호를 입력하세요.");
		String gno = br.readLine();

		try {
			ps = conn.prepareStatement("delete from " + className + " where gno =?");
			ps.setString(1, gno);
			ps.executeUpdate();
			
			System.out.println(gno + "번 상품이 삭제되었습니다.");
		} catch (Exception e) {	e.printStackTrace(); }
	}

	// update
	public static void update(String className) throws SQLException, IOException {
		selectAll(className);
		System.out.println("수정할 상품의 번호를 입력하세요.");
		String gno = br.readLine();
		System.out.println("수정할 컬럼명을 입력해주세요 (GNAME/G_START/G_END)");
		String col = br.readLine();
		System.out.println("수정할 내용을 입력해주세요");
		try {
			ps = conn.prepareStatement("UPDATE " + className + " SET " + col + " = ? WHERE GNO=" + gno);
			switch (col) {
			case "gname": {
				ps.setString(1, br.readLine());
				break;
			}
			case "g_start": {
				ps.setInt(1, Integer.parseInt(br.readLine()));
				break;
			}
			case "g_end": {
				ps.setInt(1, Integer.parseInt(br.readLine()));
				break;
			}
			}
			ps.executeUpdate();
			System.out.println(gno + "번 레코드 수정되었습니다.");

		} catch (Exception e) { e.printStackTrace(); }

	}

	// select ~ where
	public static void selectByGno(String className) throws SQLException {
		System.out.println("조회할 상품의 번호를 입력해 주세요.");
		String sql = "SELECT * FROM " + className + " where gno=" + sc.next();
		rs = stmt.executeQuery(sql);

		ResultSetMetaData rsmd = rs.getMetaData(); // 해당 테이블에 대한 정보
		int count = rsmd.getColumnCount();

		while (rs.next()) {
			for (int i = 1; i <= count; i++) { // 각 타입별로 출력하기

				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + " ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + " ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + " ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + " ");
					break;
				default:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					break;
				} // end switch
			} // end for
		} // end while

	}

	// rollback
	public static void rollback() throws SQLException {
		conn.rollback();
		System.out.println("rollback success");
	}

	// commit
	public static void commit() throws SQLException {
		conn.commit();
		System.out.println("commit success");
	}

}
