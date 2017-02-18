package payroll.connection;

import java.sql.Connection;
import java.sql.DriverManager;


;

public class InitConnection {
	@SuppressWarnings("finally")

	public static Connection connection()
	{
		Connection con = null;
		try {
			Class.forName(Costanst.dbClass).newInstance();
			con = DriverManager.getConnection(Costanst.url,
					Costanst.uesrName, Costanst.password);
			con.setAutoCommit(true);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{

			return con;
	
		}}
}

