package edu.kosa.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleUserDaoImpl extends UserDAO{

	@Override
	public Connection getConnection() throws Exception {
		// 1. Driver load
		Class.forName("oracle.jdbc.OracleDriver");
		
		// 2. connection & open
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid ="zoo";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		
		return conn;
	}

}
