package payroll.serviceempl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseFetchMail {
public static boolean fetchdata(String username,String password)
{
	{
		boolean status=false;
		try{
			Connection connection;
			Class.forName("com.mysql.jdbc.Driver");
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "anand");
			PreparedStatement ps = connection.prepareStatement("select user_name from texon where user_name=?");
			ps.setString(1, username);
			ResultSet rs =ps.executeQuery();
			if(rs.next())
			{
				String uname = rs.getString("name");
				
				if(username.equals(uname))
			{
					ps =connection.prepareStatement("select password from texon where password=?");
					ps.setString(1, password);
					ResultSet i = ps.executeQuery();
					System.out.println(password);
					status = true ;
			}
			else
			{
				status = false;
			}
			}
		
		}
		catch(SQLException | ClassNotFoundException e)
		{
			System.err.println(e);
		}
		return status;	
		}
}
}
