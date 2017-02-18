package RegisterVo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import DaoVoClass.RegisterDetailsVo;

public class RegisterVoClass {
public static int save(RegisterDetailsVo r){
	int status=0;
	try {
		Connection connection;
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","anand");
		PreparedStatement ps =connection.prepareStatement("insert into regtable ('name', 'passowrd','date', 'address', 'phoneNumber', 'email') values('?','?',Now(),'?','?','?')");
		ps.setString(1, r.getName());
		ps.setString(2, r.getPassword());
		ps.setString(3, r.getPhoneNumber());
		ps.setString(4, r.getEmail());
		status = ps.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
	}
	return status;
}
}
