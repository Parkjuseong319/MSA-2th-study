package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver load... Exception
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load success!!");
		
		// 2. Connection & Open
					// driver:@ip:portNumber:SID ( or 전역데이터베이스명)
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "Zoo";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success!");
		
		// 3. 사용 (DML 명령어 - select)
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");		// ctrl + shift + x 누르면 대문자로 변환
						// 반환 값이 있는 경우 execureQuery() - select
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while(rs.next()) {
			int gno = rs.getInt(1);		// 필드 번호 
			String gname = rs.getString("gname");	// 필드명 <- 이 방법을 더 추천
			int g_s = rs.getInt(3);
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}		// while end
		// 4. 닫기 (자원 반환)
		rs.close();   	stmt.close();  	 	conn.close();
	}
	
}
