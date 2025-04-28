package ex01.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) {
		Connection conn = ConnectionHelper.getConection("oracle");
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
//			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			// SQL 구문, HTML Tag는 java에서 문자열 취급한다.
//			String sql = "CREATE TABLE KOSADB(NAME VARCHAR2(20), AGE NUMBER)";
			StringBuffer sb = new StringBuffer();
//			sb.append("if exists table drop table kosaDB");
			sb.append("CREATE TABLE KOSADB(NAME VARCHAR2(20), AGE NUMBER)");
			System.out.println(sb.toString());
			stmt.executeQuery(sb.toString());
			
			String sql = "INSERT INTO KOSADB VALUES('ZOO', 28)";
			int result = stmt.executeUpdate(sql);
			
			sql = "select * from kosadb";
			rs = stmt.executeQuery(sql);		// select문 반환값 존재
			
			System.out.println(result + " 개 추가 완료");
			
			while(rs.next()) {
				System.out.println("name: " + rs.getString("name") + "\t");
				System.out.println("age: " + rs.getInt("age"));
			}
			
//			sql = "drop table kosadb";
//			result = stmt.executeUpdate(sql);
//			System.out.println("drop table: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			CloseHelper.close(rs);	CloseHelper.close(stmt);	CloseHelper.close(conn);
		}
	}
}
