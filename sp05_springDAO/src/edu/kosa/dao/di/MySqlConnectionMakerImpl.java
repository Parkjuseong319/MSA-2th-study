package edu.kosa.dao.di;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnectionMakerImpl implements ConnectionMaker {

	@Override
	public Connection makeConnection() throws Exception {
		// 1. Driver load
		Class.forName("com.mysql.jdbc.Driver");

		// 2. connection & open
		String url = "jdbc:mysql://@localhost:3306/DB¸í";
		String uid = "zoo";
		String pwd = "mysql";

		Connection conn = DriverManager.getConnection(url, uid, pwd);

		return conn;
	}

}
