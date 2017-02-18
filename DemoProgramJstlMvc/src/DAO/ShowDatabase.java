package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import DaoVoClass.RegisterDetailsVo;

public class ShowDatabase {

	public static List<RegisterDetailsVo> empListgetBy()
	{
		
		List<RegisterDetailsVo> reglist = new ArrayList<RegisterDetailsVo>();
//		List<RegisterDetailsVo> idlist = new ArrayList<RegisterDetailsVo>();
		try {
			Connection connection;
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "anand");
	    	  PreparedStatement ps = connection.prepareStatement("select * from regtable");
	     	 ResultSet rs= ps.executeQuery();
			 ResultSetMetaData rsmd = ps.getMetaData();
			 
			 while(rs.next())
			 {
				 RegisterDetailsVo reg = new RegisterDetailsVo();
				 reg.setId(rs.getInt("id"));
				 reg.setName(rs.getString("name"));
				 reg.setAddress(rs.getString("address"));
				 reg.setPassword(rs.getString("password"));
				 reg.setPhoneNumber(rs.getString("phoneNumber"));
				 reg.setEmail(rs.getString("email"));
				 reg.setDate(rs.getDate("date"));
				 reglist.add(reg);
//				 reglist.add(rs.getInt("id"), (RegisterDetailsVo) idlist);
				 
			 }
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception
		}  
		
		return reglist;
	}

	public static List<RegisterDetailsVo> regFormAjax(String name) {
		List<RegisterDetailsVo> reglists = new ArrayList<RegisterDetailsVo>();
		
		// TODO Auto-generated method stub
		try {
			Connection connection;
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "anand");
	    	  PreparedStatement ps = connection.prepareStatement("select * from regtable where name ='"+name+"'");
	     	 ResultSet rs= ps.executeQuery();
//			 ResultSetMetaData rsmd = ps.getMetaData();
			 
			 while(rs.next())
			 {
				 RegisterDetailsVo reg = new RegisterDetailsVo();
				 reg.setId(rs.getInt("id"));
				 reg.setName(rs.getString("name"));
				 reg.setAddress(rs.getString("address"));
				 reg.setPassword(rs.getString("password"));
				 reg.setPhoneNumber(rs.getString("phoneNumber"));
				 reg.setEmail(rs.getString("email"));
				 reg.setDate(rs.getDate("date"));
				 reglists.add(reg);
//				 reglist.add(rs.getInt("id"), (RegisterDetailsVo) idlist);
				 
			 }
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception
		}  
		
		return reglists;
	}

	public static List<RegisterDetailsVo> regFormAjax() {
		// TODO Auto-generated method stub
	List<RegisterDetailsVo> regs = new ArrayList<RegisterDetailsVo>();
		
		// TODO Auto-generated method stub
		try {
			Connection connection;
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "anand");
	    	  PreparedStatement ps = connection.prepareStatement("select * from regtable");
	     	 ResultSet rs= ps.executeQuery();
//			 ResultSetMetaData rsmd = ps.getMetaData();
			 
			 while(rs.next())
			 {
				 RegisterDetailsVo reg = new RegisterDetailsVo();
				 reg.setId(rs.getInt("id"));
				 reg.setName(rs.getString("name"));
				 reg.setAddress(rs.getString("address"));
				 reg.setPassword(rs.getString("password"));
				 reg.setPhoneNumber(rs.getString("phoneNumber"));
				 reg.setEmail(rs.getString("email"));
				 reg.setDate(rs.getDate("date"));
				 regs.add(reg);
//				 reglist.add(rs.getInt("id"), (RegisterDetailsVo) idlist);
				 
			 }
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception
		}  
		
		return regs;
	}
	
	
}
