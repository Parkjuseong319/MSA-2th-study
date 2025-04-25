package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Zoo", "oracle");
		
		// 3. 사용 (DML 명령어 - Insert)	- Statement / PrepareStatement
		Statement stmt = conn.createStatement();

		// 1) 고정값 레코드 입력
//		String sql = "insert into gift values(11, '텀블러', 10000, 20000)";		// auto commit
		
		// 2) 레코드 값을 입력 받아서 처리 - Scanner, IO, main args
		String sql = "insert into gift values("+args[0]+ ",' " + args[1] +"', "+ args[2] + "," + args[3] +")";		// auto commit

		
		int result = stmt.executeUpdate(sql);		// return type - int
		System.out.println(result + " 개 데이터 추가 성공");
		
		
		// 4. 닫기 (자원 반환)
		stmt.close();  	 	conn.close();
	}
}
