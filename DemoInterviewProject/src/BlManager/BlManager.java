package BlManager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;









import controler.addservlet;
import model.Employee;

public class BlManager {

	public List<Employee> insertMethod(String name, Date mydatee, String adress, String gender, double salary) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","anand");
			java.sql.PreparedStatement ps = con.prepareStatement("insert into demo.employee(Name,birth_date,address,gender,salary) values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setDate(2,mydatee);
			ps.setString(3, adress);
			ps.setString(4, gender);
			ps.setDouble(5, salary);
			
			int i = ps.executeUpdate();
			System.out.println(ps);
		} catch (SQLException|ClassNotFoundException e) {
			// TODO: handle exception
			System.err.println(e);
		}
		
		return list;
	}

	public static List<Employee> showEmp() {
		// TODO Auto-generated method stub
	
		List<Employee> list = new ArrayList<Employee>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cona = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","anand" );
			java.sql.PreparedStatement ps = cona.prepareStatement("select * from demo.registrationinfo ");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Employee e = new Employee();
				e.setEmployeeId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setAddress(rs.getString(3));
				e.setGender(rs.getString(4));
				e.setSalary(rs.getDouble(5));
				/*e.setBirth_date(rs.getDate(6));*/
				list.add(e);
			}
			
			}
			
		 catch (SQLException  | ClassNotFoundException e) {
			// TODO: handle exception
			System.err.println(e);
		}
		return list;
	}

}
