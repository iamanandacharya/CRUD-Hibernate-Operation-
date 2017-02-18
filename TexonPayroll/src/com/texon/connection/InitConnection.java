package com.texon.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class InitConnection {
	@SuppressWarnings("finally")
	public static Connection connection(){
		
		Connection con = null;
		try {
			Class.forName(Constants.dbClass).newInstance();
			con = DriverManager.getConnection(Constants.dbUrl,
					Constants.dbUser, Constants.dbPwd);
			con.setAutoCommit(true);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return con;
		}
	}
}
