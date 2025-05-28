package edu.kosa.dao.di;

import java.sql.Connection;
import java.sql.DriverManager;

// Oracle DB connect
public class ConnectionMakerImpl implements ConnectionMaker {

	@Override
	public Connection makeConnection() throws Exception {
		// 1. Driver load
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. connection & open
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "zoo";
		String pwd = "oracle";

		Connection conn = DriverManager.getConnection(url, uid, pwd);

		return conn;
	}

}
