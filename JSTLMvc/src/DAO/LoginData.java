package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginData {
	public static boolean validate(String userName, String password)
	{
	boolean status=false;
	try{
		Connection connection;
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "anand");
		PreparedStatement ps = connection.prepareStatement("select name,password from regtable where name=? and password=?");
		ps.setString(1, userName);
		ps.setString(2, password);
		ResultSet rs  = ps.executeQuery();
		
		if(rs.next())
		{
		String n = rs.getString("name");
		String p = rs.getString("password");
		if(userName.equals(n) && password.equals(p))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;	
	}
}
