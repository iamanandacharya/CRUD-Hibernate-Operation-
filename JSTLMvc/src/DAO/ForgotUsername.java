package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ForgotUsername 

{
	public static boolean validate(String userName,String password )
	{
{
	boolean status = false;
	
	try {
	Connection connection;
	Class.forName("com.mysql.jdbc.Driver");
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","anand");
	PreparedStatement ps = connection.prepareStatement("select password from regtable where password=?");
	ps.setString(1, password);
	ResultSet rs = ps.executeQuery();
	
	if(rs.next())
	{
		String pass = rs.getString("password");
		if(password.equals(pass))
		{
			ps = connection.prepareStatement("select name from regtable where name=?");
			ps.setString(1, userName);
			ResultSet rs1 = ps.executeQuery();
			System.out.println(rs1);
			status = true;
		}
		else {
			status = false;
		}
	}
	
	} catch (ClassNotFoundException | SQLException e) {
	
		System.out.println(e);
	}
	
	

	return status;
}
}
}
