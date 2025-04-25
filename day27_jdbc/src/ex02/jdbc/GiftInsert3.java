package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftInsert3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Zoo", "oracle");
		
		// 3. 사용 (DML 명령어 - Insert)	- PrepareStatement
		
		System.out.println("Gift table data input: 상품번호/상품명/최저가/최고가 = ?");
		String sql = "INSERT INTO GIFT VALUES(?, ?, ? , ?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, sc.nextInt());					// 첫번째 인자값은 ?의 순서. 두번째는 들어갈 값.
		ps.setString(2, sc.next());		// DB에선 varchar type이지만 java에선 String type이기에 setString을 사용
		ps.setInt(3, sc.nextInt());
		ps.setInt(4, sc.nextInt());
		int result = ps.executeUpdate();	// 반환값이 없는 경우 - insert, update, delete.
		
		System.out.println(result + "개 데이터 추가 완료");
		// 4. 닫기(자원반환)
		ps.close();  	conn.close();
	}
}
