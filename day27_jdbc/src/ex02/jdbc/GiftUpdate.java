package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GiftUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// gno로 상품 정보 update
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Zoo", "oracle");
		
		// 3. update 하기
		String sql = "UPDATE GIFT SET GNAME=?, G_START=?, G_END=? WHERE GNO = ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "자전거");
		ps.setInt(2, 200000);
		ps.setInt(3, 800000);
		ps.setInt(4, 20);
		int result = ps.executeUpdate();
		
		System.out.println(result + "개 데이터 수정 완료");
		
		//4. 닫기
		ps.close();  	 conn.close();
	}
}
