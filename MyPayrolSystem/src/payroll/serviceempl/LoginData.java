package payroll.serviceempl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.RemoteEndpoint.Basic;

import payroll.connection.InitConnection;
import payroll.service.Service;
import payroll.vo.EmpAllowances;
import payroll.vo.EmpDeductionVo;
import payroll.vo.EmpListVO;
import payroll.vo.SalaryVo;


public class LoginData implements Service {
	public static boolean validate(String userName, String password)
	{
	boolean status=false;
	try{
		Connection connection;
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");
		PreparedStatement ps = connection.prepareStatement("select user_name,password from registration_info where user_name=? and password=?");
		ps.setString(1, userName);
		ps.setString(2, password);
		ResultSet rs  = ps.executeQuery();
		
		if(rs.next())
		{
		String n = rs.getString("user_name");
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
	
	public static List<EmpListVO> empListgetBy(String search) {
		// TODO Auto-generated method stub

		Connection connection = null;
		
		List<EmpListVO> empList = new ArrayList<EmpListVO>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			
		
			String emp_details_query = "select * from texon.employeeinfo  where emp_code='"+search+"'";

			ResultSet emp_details_rs = stmt.executeQuery(emp_details_query);
			while(emp_details_rs.next()){
				EmpListVO reg = new EmpListVO();
				reg.setId(emp_details_rs.getInt("emp_id"));
				 reg.setEmpName(emp_details_rs.getString("emp_name"));
				 reg.setPresent_add(emp_details_rs.getString("present_add"));
				 reg.setCity(emp_details_rs.getString("city"));
				 reg.setPincode(emp_details_rs.getString("pincode"));
				 reg.setPermanant_addrss(emp_details_rs.getString("permanant_addrss"));
				 reg.setPh_num(emp_details_rs.getString("ph_num"));
				 reg.setMob_num(emp_details_rs.getString("mob_num"));
				 reg.setBlood_group(emp_details_rs.getString("blood_group"));
				 reg.setNationality(emp_details_rs.getString("nationality"));
				 reg.setLanguage_known(emp_details_rs.getString("language_known"));
				 reg.setPan_card_num(emp_details_rs.getString("pan_card_num"));
				 reg.setEmp_type(emp_details_rs.getString("emp_type"));
				 reg.setEmp_grade(emp_details_rs.getString("emp_grade"));
//				 reg.setImage(emp_details_rs.getBlob("image"));
				 reg.setEmp_code(emp_details_rs.getString("emp_code"));
//				 reg.setBirth_of_date(emp_details_rs.getDate("date_of_birth"));
				 reg.setEmp_signature(emp_details_rs.getString("emp_signature"));
//				 reg.setEmail(emp_details_rs.getString("emali"));
				 empList.add(reg);
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return empList;
	
//		
//		List<EmpListVO> reglist = new ArrayList<EmpListVO>();
////		List<RegisterDetailsVo> idlist = new ArrayList<RegisterDetailsVo>();
//		try {
//			Connection connection;
//	    	  Class.forName("com.mysql.jdbc.Driver");
//	    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");
//	    	  PreparedStatement ps = connection.prepareStatement(---);
//	    	  ps.setString(1, search);
//	     	 ResultSet rs= ps.executeQuery();
//			 
//			
//			 while(rs.next())
//			 {
//				 EmpListVO reg = new EmpListVO();
//				 reg.setEmpName(rs.getString("emp_name"));
//				 reg.setPresent_add(rs.getString("present_add"));
//				 reg.setCity(rs.getString("city"));
//				 reg.setPincode(rs.getString("pincode"));
//				 reg.setPermanant_addrss(rs.getString("permanant_addrss"));
//				 reg.setPh_num(rs.getString("ph_num"));
//				 reg.setMob_num(rs.getString("mob_num"));
//				 reg.setBlood_group(rs.getString("blood_group"));
//				 reg.setNationality(rs.getString("nationality"));
//				 reg.setLanguage_known(rs.getString("language_known"));
//				 reg.setPan_card_num(rs.getString("pan_card_num"));
//				 reg.setEmp_type(rs.getString("emp_type"));
//				 reg.setEmp_grade(rs.getString("emp_grade"));
////				 reg.setImage(rs.getBlob("image"));
//				 reg.setEmp_code(rs.getString("emp_code"));
////				 reg.setBirth_of_date(rs.getDate("date_of_birth"));
//				 reg.setEmp_signature(rs.getString("emp_signature"));
//				 reg.setEmail(rs.getString("emali"));
//				 
//				 
//				
//				 reglist.add(reg);
////				 reglist.add(rs.getInt("id"), (RegisterDetailsVo) idlist);
//				 
//			 }
//			
//		} catch (SQLException | ClassNotFoundException e) {
//			// TODO: handle exception
//		}  
//		
//		return reglist;
	}

	

	public  List<EmpListVO> addEmpData(String empName, String presentadd, String city, String pincode, String permanantaddrss, String phnum, String mobnum, String bloodgroup, String nationality, String languageknown, String pancardNum, String emptype, String empgrade, String empcode, String empsignature) {

		List<EmpListVO> empLists = new ArrayList<EmpListVO>();
		try{ 	
			 Connection connection ;
			 Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");
			 
			
			 PreparedStatement ps = connection.prepareStatement("insert into texon.employeeinfo(`emp_name`,`present_add`,`city`,`pincode`,`permanant_addrss`,`ph_num` , `mob_num`, `blood_group`, `nationality`, `language_known`, `pan_card_num`, `emp_type`, `emp_grade`, `emp_code`,`emp_signature`) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	         ps.setString(1, empName);
	         ps.setString(2, presentadd);
	         ps.setString(3, city);
	         ps.setString(4, pincode);
	         ps.setString(5, permanantaddrss);
	         ps.setString(6, phnum);
	         ps.setString(7, mobnum);
	         ps.setString(8, bloodgroup);
	         ps.setString(9, nationality);
	         ps.setString(10, languageknown);
	         ps.setString(11, pancardNum);
	         ps.setString(12, emptype);
	         ps.setString(13, empgrade);
	         ps.setString(14, empcode);
	         ps.setString(15, empsignature);
	         ps.executeUpdate();
	       
			}
			catch(SQLException|ClassNotFoundException  e)
			{
				e.printStackTrace();
			}
		//		// TODO Auto-generated method stub
//		
//		
//		List<EmpListVO> empLists = new ArrayList<EmpListVO>();
//		try{
//			Connection connection;
//			Class.forName("com.mysql.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","anand");
//			PreparedStatement ps =connection.prepareStatement("insert into regtable ('name', 'passowrd','date', 'address', 'phoneNumber', 'email') values('?','?',Now(),'?','?','?')");
//			ps.setString(1, ps.getName());
//			ps.setString(2, ps.getPassword());
//			ps.setString(3, ps.getPhoneNumber());
//			ps.setString(4, ps.getEmail());
//			ps.executeUpdate();
//			 
//		}
//		catch(SQLException ex){
//			System.err.println(ex);
//		}
//		return empLists;
//	
//		
//		
		return empLists;
	}

	public static List<EmpListVO> addEmpDatas(String empName,
			String presentadd, String city, String pincode,
			String permanantaddrss, String phnum, String mobnum,
			String bloodgroup, String nationality, String languageknown,
			String pancardNum, String emptype, String empgrade, String empcode,
			String empsignature) {
		
		List<EmpListVO> empLists = new ArrayList<EmpListVO>();
		try{ 	
			 Connection connection ;
			 Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");
			 
			
			 PreparedStatement ps = connection.prepareStatement("insert into texon.employeeinfo(`emp_name`,`present_add`,`city`,`pincode`,`permanant_addrss`,`ph_num` , `mob_num`, `blood_group`, `nationality`, `language_known`, `pan_card_num`, `emp_type`, `emp_grade`, `emp_code`,`emp_signature`) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	         ps.setString(1, empName);
	         ps.setString(2, presentadd);
	         ps.setString(3, city);
	         ps.setString(4, pincode);
	         ps.setString(5, permanantaddrss);
	         ps.setString(6, phnum);
	         ps.setString(7, mobnum);
	         ps.setString(8, bloodgroup);
	         ps.setString(9, nationality);
	         ps.setString(10, languageknown);
	         ps.setString(11, pancardNum);
	         ps.setString(12, emptype);
	         ps.setString(13, empgrade);
	         ps.setString(14, empcode);
	         ps.setString(15, empsignature);
	         ps.executeUpdate();
	       
			}
			catch(SQLException|ClassNotFoundException  e)
			{
				e.printStackTrace();
			}
		//		// TODO Auto-generated method stub
//		
//		
//		List<EmpListVO> empLists = new ArrayList<EmpListVO>();
//		try{
//			Connection connection;
//			Class.forName("com.mysql.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","anand");
//			PreparedStatement ps =connection.prepareStatement("insert into regtable ('name', 'passowrd','date', 'address', 'phoneNumber', 'email') values('?','?',Now(),'?','?','?')");
//			ps.setString(1, ps.getName());
//			ps.setString(2, ps.getPassword());
//			ps.setString(3, ps.getPhoneNumber());
//			ps.setString(4, ps.getEmail());
//			ps.executeUpdate();
//			 
//		}
//		catch(SQLException ex){
//			System.err.println(ex);
//		}
//		return empLists;
		// TODO Auto-generated method stub
		return empLists;
	}

//	@Override
//	public List<EmpListVO> updateList(String empName, String presentadd,
//			String city, String pincode, String permanantaddrss, String phnum,
//			String mobnum, String bloodgroup, String nationality,
//			String languageknown, String pancardNum, String emptype,
//			String empgrade, String empcode, String empsignature) {
//		// TODO Auto-generated method stub
//		List<EmpListVO> empUpadateLists = new ArrayList<EmpListVO>();
//		try{ 	
//			 Connection connection ;
//			 Class.forName("com.mysql.jdbc.Driver");
//			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");
//			 
//			
//			 PreparedStatement ps = connection.prepareStatement("update regtable set emp_name=?, present_add=?, city=?, pincode=?, permanant_addrss=?, ph_num=?,mob_num=?, blood_group=?,nationality=?, language_known=?,pan_card_num=?, emp_type=?,emp_grade=?, emp_code=?, emp_signature=? where id=? ");
//	         ps.setString(1, empName);
//	         ps.setString(2, presentadd);
//	         ps.setString(3, city);
//	         ps.setString(4, pincode);
//	         ps.setString(5, permanantaddrss);
//	         ps.setString(6, phnum);
//	         ps.setString(7, mobnum);
//	         ps.setString(8, bloodgroup);
//	         ps.setString(9, nationality);
//	         ps.setString(10, languageknown);
//	         ps.setString(11, pancardNum);
//	         ps.setString(12, emptype);
//	         ps.setString(13, empgrade);
//	         ps.setString(14, empcode);
//	         ps.setString(15, empsignature);
//	         ps.executeUpdate();
//	       
//			}
//			catch(SQLException|ClassNotFoundException  e)
//			{
//				e.printStackTrace();
//			}
//		//		// TODO Auto-generated method stub
////		
////		
////		List<EmpListVO> empLists = new ArrayList<EmpListVO>();
////		try{
////			Connection connection;
////			Class.forName("com.mysql.jdbc.Driver");
////			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","anand");
////			PreparedStatement ps =connection.prepareStatement("insert into regtable ('name', 'passowrd','date', 'address', 'phoneNumber', 'email') values('?','?',Now(),'?','?','?')");
////			ps.setString(1, ps.getName());
////			ps.setString(2, ps.getPassword());
////			ps.setString(3, ps.getPhoneNumber());
////			ps.setString(4, ps.getEmail());
////			ps.executeUpdate();
////			 
////		}
////		catch(SQLException ex){
////			System.err.println(ex);
////		}
////		return empLists;
//		// TODO Auto-generated method stub
//	
//		return null;
//	}

	@Override
	public List<EmpListVO> updateList(String id, String empName,
			String presentadd, String city, String pincode,
			String permanantaddrss, String phnum, String mobnum,
			String bloodgroup, String nationality, String languageknown,
			String pancardNum, String emptype, String empgrade, String empcode,
			String empsignature) {
		// TODO Auto-generated method stub
		List<EmpListVO> empUpadateLists = new ArrayList<EmpListVO>();
		try{ 	
			 Connection connection ;
			 Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");
			 
			
			 PreparedStatement ps = connection.prepareStatement("update texon.employeeinfo set emp_name=?, present_add=?, city=?, pincode=?, permanant_addrss=?, ph_num=?,mob_num=?, blood_group=?,nationality=?, language_known=?,pan_card_num=?, emp_type=?,emp_grade=?, emp_code=?, emp_signature=? where emp_code=? ");
			 
			 ps.setString(1, empName);
	         ps.setString(2, presentadd);
	         ps.setString(3, city);
	         ps.setString(4, pincode);
	         ps.setString(5, permanantaddrss);
	         ps.setString(6, phnum);
	         ps.setString(7, mobnum);
	         ps.setString(8, bloodgroup);
	         ps.setString(9, nationality);
	         ps.setString(10, languageknown);
	         ps.setString(11, pancardNum);
	         ps.setString(12, emptype);
	         ps.setString(13, empgrade);
	         ps.setString(14, empcode);
	         ps.setString(15, empsignature);
	         ps.setString(16, id);
	         ps.executeUpdate();
	       
			}
			catch(SQLException|ClassNotFoundException  e)
			{
				e.printStackTrace();
			}
		//		// TODO Auto-generated method stub
//		
//		
//		List<EmpListVO> empLists = new ArrayList<EmpListVO>();
//		try{
//			Connection connection;
//			Class.forName("com.mysql.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","anand");
//			PreparedStatement ps =connection.prepareStatement("insert into regtable ('name', 'passowrd','date', 'address', 'phoneNumber', 'email') values('?','?',Now(),'?','?','?')");
//			ps.setString(1, ps.getName());
//			ps.setString(2, ps.getPassword());
//			ps.setString(3, ps.getPhoneNumber());
//			ps.setString(4, ps.getEmail());
//			ps.executeUpdate();
//			 
//		}
//		catch(SQLException ex){
//			System.err.println(ex);
//		}
//		return empLists;
		// TODO Auto-generated method stub
	
		return empUpadateLists;
	}

	public static List<EmpListVO> empListgetByData() {
		// TODO Auto-generated method stub
Connection connection = null;
		
		List<EmpListVO> empListdata = new ArrayList<EmpListVO>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			
		
			String emp_details_query = "select * from texon.employeeinfo";

			ResultSet emp_details_rs = stmt.executeQuery(emp_details_query);
			while(emp_details_rs.next()){
				EmpListVO reg = new EmpListVO();
				reg.setId(emp_details_rs.getInt("emp_id"));
				 reg.setEmpName(emp_details_rs.getString("emp_name"));
				 reg.setPresent_add(emp_details_rs.getString("present_add"));
				 reg.setCity(emp_details_rs.getString("city"));
				 reg.setPincode(emp_details_rs.getString("pincode"));
				 reg.setPermanant_addrss(emp_details_rs.getString("permanant_addrss"));
				 reg.setPh_num(emp_details_rs.getString("ph_num"));
				 reg.setMob_num(emp_details_rs.getString("mob_num"));
				 reg.setBlood_group(emp_details_rs.getString("blood_group"));
				 reg.setNationality(emp_details_rs.getString("nationality"));
				 reg.setLanguage_known(emp_details_rs.getString("language_known"));
				 reg.setPan_card_num(emp_details_rs.getString("pan_card_num"));
				 reg.setEmp_type(emp_details_rs.getString("emp_type"));
				 reg.setEmp_grade(emp_details_rs.getString("emp_grade"));
//				 reg.setImage(emp_details_rs.getBlob("image"));
				 reg.setEmp_code(emp_details_rs.getString("emp_code"));
//				 reg.setBirth_of_date(emp_details_rs.getDate("date_of_birth"));
				 reg.setEmp_signature(emp_details_rs.getString("emp_signature"));
//				 reg.setEmail(emp_details_rs.getString("emali"));
				 empListdata.add(reg);
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return empListdata;
			
//		
//		List<EmpListVO> reglist = new ArrayList<EmpListVO>();
////		List<RegisterDetailsVo> idlist = new ArrayList<RegisterDetailsVo>();
//		try {
//			Connection connection;
//	    	  Class.forName("com.mysql.jdbc.Driver");
//	    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");
//	    	  PreparedStatement ps = connection.prepareStatement(---);
//	    	  ps.setString(1, search);
//	     	 ResultSet rs= ps.executeQuery();
//			 
//			
//			 while(rs.next())
//			 {
//				 EmpListVO reg = new EmpListVO();
//				 reg.setEmpName(rs.getString("emp_name"));
//				 reg.setPresent_add(rs.getString("present_add"));
//				 reg.setCity(rs.getString("city"));
//				 reg.setPincode(rs.getString("pincode"));
//				 reg.setPermanant_addrss(rs.getString("permanant_addrss"));
//				 reg.setPh_num(rs.getString("ph_num"));
//				 reg.setMob_num(rs.getString("mob_num"));
//				 reg.setBlood_group(rs.getString("blood_group"));
//				 reg.setNationality(rs.getString("nationality"));
//				 reg.setLanguage_known(rs.getString("language_known"));
//				 reg.setPan_card_num(rs.getString("pan_card_num"));
//				 reg.setEmp_type(rs.getString("emp_type"));
//				 reg.setEmp_grade(rs.getString("emp_grade"));
////				 reg.setImage(rs.getBlob("image"));
//				 reg.setEmp_code(rs.getString("emp_code"));
////				 reg.setBirth_of_date(rs.getDate("date_of_birth"));
//				 reg.setEmp_signature(rs.getString("emp_signature"));
//				 reg.setEmail(rs.getString("emali"));
//				 
//				 
//				
//				 reglist.add(reg);
////				 reglist.add(rs.getInt("id"), (RegisterDetailsVo) idlist);
//				 
//			 }
//			
//		} catch (SQLException | ClassNotFoundException e) {
//			// TODO: handle exception
//		}  
//		
//		return reglist;
	
	}

	public static List<EmpAllowances> empAllowDisplaytBy(String d1) {
		// TODO Auto-generated method stub
		Connection connection = null;
		
		List<EmpAllowances> empAllowList = new ArrayList<EmpAllowances>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			
		
			String emp_details_query = "select * from texon.emp_allowances  where emp_code='"+d1+"'";
			ResultSet emp_details_rs = stmt.executeQuery(emp_details_query);
			while(emp_details_rs.next()){
				EmpAllowances reg = new EmpAllowances();
				reg.setAllowId(emp_details_rs.getInt("allow_id"));
				reg.setBasic(emp_details_rs.getDouble("basic"));
				reg.setHra(emp_details_rs.getDouble("HRA"));
				reg.setConveyAllow(emp_details_rs.getDouble("convey_allow"));
				reg.setMedicalAllow(emp_details_rs.getDouble("medical_allow"));
				reg.setSpecialAllow(emp_details_rs.getDouble("special_allow"));
				reg.setMonthlyIncentive(emp_details_rs.getDouble("monthly_incentive"));
				reg.setPerquisites(emp_details_rs.getDouble("perquisites"));
				reg.setChildEduAllow(emp_details_rs.getDouble("child_edu_allow"));
				reg.setGross(emp_details_rs.getDouble("gross"));
				reg.setBalanceForward(emp_details_rs.getDouble("balance_forward"));
				reg.setReimbursement(emp_details_rs.getDouble("reimbursement"));
				reg.setTotalAllow(emp_details_rs.getDouble("total_allow"));
				reg.setMonth(emp_details_rs.getDate("month"));
				reg.setYear(emp_details_rs.getDate("year"));
				reg.setModifiedDate(emp_details_rs.getDate("modified_date"));
				reg.setEmp_code(emp_details_rs.getString("emp_code"));
			
				empAllowList.add(reg);
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return empAllowList;
		
	}

	public static List<EmpAllowances> empAllowListget() {
		// TODO Auto-generated method stub
		
Connection connection = null;
		
		List<EmpAllowances> empAllowsListget = new ArrayList<EmpAllowances>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			
		
			String emp_details_query = "select * from texon.emp_allowances";
			ResultSet emp_details_rs = stmt.executeQuery(emp_details_query);
			while(emp_details_rs.next()){
				EmpAllowances reg = new EmpAllowances();
				
				reg.setBasic(emp_details_rs.getDouble("basic"));
				reg.setHra(emp_details_rs.getDouble("HRA"));
				reg.setConveyAllow(emp_details_rs.getDouble("convey_allow"));
				reg.setMedicalAllow(emp_details_rs.getDouble("medical_allow"));
				reg.setSpecialAllow(emp_details_rs.getDouble("special_allow"));
				reg.setMonthlyIncentive(emp_details_rs.getDouble("monthly_incentive"));
				reg.setPerquisites(emp_details_rs.getDouble("perquisites"));
				reg.setChildEduAllow(emp_details_rs.getDouble("child_edu_allow"));
				reg.setGross(emp_details_rs.getDouble("gross"));
				reg.setBalanceForward(emp_details_rs.getDouble("balance_forward"));
				reg.setReimbursement(emp_details_rs.getDouble("reimbursement"));
				reg.setTotalAllow(emp_details_rs.getDouble("total_allow"));
				reg.setMonth(emp_details_rs.getDate("month"));
				reg.setYear(emp_details_rs.getDate("year"));
				reg.setModifiedDate(emp_details_rs.getDate("modified_date"));
				reg.setEmp_code(emp_details_rs.getString("emp_code"));
				empAllowsListget.add(reg);
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return empAllowsListget;
		
	}

	@Override
	public List<EmpAllowances> addEmpAllowData(String basic, String hRA,
			String conveyanceAllowances, String medicalAlowances,
			String specialAllowances, String monthlyIncentive,
			String perquisites, String childEduAllow, String gross,
			String balanceForward, String reimbursement, String totalAllow,
			String month, String year, String modifiedDate,String EmpCode) {
		// TODO Auto-generated method stub
		List<EmpAllowances> addEmpAllowsListget = new ArrayList<EmpAllowances>();
		try{ 	
			 Connection connection ;
			 Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");
			 
			
			 PreparedStatement ps = connection.prepareStatement("insert into texon.emp_allowances(`basic`,`HRA`,`convey_allow`,`medical_allow`,`special_allow`,`monthly_incentive` , `perquisites`, `child_edu_allow`, `gross`, `balance_forward`, `reimbursement`, `total_allow`, `month`, `year`,`modified_date`,emp_code) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	         ps.setString(1, basic);
	         ps.setString(2, hRA);
	         ps.setString(3, conveyanceAllowances);
	         ps.setString(4, medicalAlowances);
	         ps.setString(5, specialAllowances);
	         ps.setString(6, monthlyIncentive);
	         ps.setString(7, perquisites);
	         ps.setString(8, childEduAllow);
	         ps.setString(9, gross);
	         ps.setString(10, balanceForward);
	         ps.setString(11, reimbursement);
	         ps.setString(12, totalAllow);
	         ps.setString(13, month);
	         ps.setString(14, year);
	         ps.setString(15, modifiedDate);
	         ps.setString(16, EmpCode);
	         ps.executeUpdate();
	       
			}
			catch(SQLException|ClassNotFoundException  e)
			{
				e.printStackTrace();
			}
		return addEmpAllowsListget;
	}

	@Override
	public List<EmpAllowances> AllowupdateList(String id, String basic,
			String hRA, String conveyanceAllowances, String medicalAlowances,
			String specialAllowances, String monthlyIncentive,
			String perquisites, String childEduAllow, String gross,
			String balanceForward, String reimbursement, String totalAllow,
			String month, String year, String modifiedDate, String empCode) {
		// TODO Auto-generated method stub
		List<EmpAllowances> empAllowUpadateLists = new ArrayList<EmpAllowances>();
		try{ 	
			 Connection connection ;
			 Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");
			 
			
			 PreparedStatement ps = connection.prepareStatement("update texon.emp_allowances set basic=?,HRA=?, convey_allow=?, medical_allow=?, special_allow=?,monthly_incentive=?,perquisites=?, child_edu_allow=?,gross=?,balance_forward=?,reimbursement=?, total_allow=?,month=?,year=?, modified_date=? where emp_code=? ");
			 
			 ps.setString(1, basic);
	         ps.setString(2, hRA);
	         ps.setString(3, conveyanceAllowances);
	         ps.setString(4, medicalAlowances);
	         ps.setString(5, specialAllowances);
	         ps.setString(6, monthlyIncentive);
	         ps.setString(7, perquisites);
	         ps.setString(8, childEduAllow);
	         ps.setString(9, gross);
	         ps.setString(10, balanceForward);
	         ps.setString(11, reimbursement);
	         ps.setString(12, totalAllow);
	         ps.setString(13, month);
	         ps.setString(14, year);
	         ps.setString(15, modifiedDate);
	         ps.setString(16, empCode);
	         ps.setString(16, id);
	         ps.executeUpdate();
	       
			}
			catch(SQLException|ClassNotFoundException  e)
			{
				e.printStackTrace();
			}
		return empAllowUpadateLists;
	}

	@Override
	public List<EmpDeductionVo> EmpDeduList(String ProfTax, String with_hold,String incomeTax,
			String other_deduction, String totalDeduction, String pf,
			String month,String year,String ModifiedDate , String empCode) {
		// TODO Auto-generated method stub
		List<EmpDeductionVo> addEmpDeduListget = new ArrayList<EmpDeductionVo>();
		try{ 	
			 Connection connection ;
			 Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");
			 
			
			 PreparedStatement ps = connection.prepareStatement("insert into texon.deductioninfo(`prof_tax`,`with_hold`,`income_tax`,`other_deduction`,`total_deduction`,`pf`,`month` , `modification_date`, `year`, `emp_code`) values (?,?,?,?,?,?,?,?,?,?)");
	         ps.setString(1, ProfTax);
	         ps.setString(2, with_hold);
	         ps.setString(3, incomeTax);
	         ps.setString(4, other_deduction);
	         ps.setString(5, totalDeduction);
	         ps.setString(6, pf);
	         ps.setString(7, month);
	         ps.setString(8, ModifiedDate);
	         ps.setString(9, year);
	        
	         ps.setString(10, empCode);
	        
	         ps.executeUpdate();
	       
			}
			catch(SQLException|ClassNotFoundException  e)
			{
				e.printStackTrace();
			}
		return addEmpDeduListget;
	}

	@Override
	public List<EmpDeductionVo> updateEmpDedData(String id, String profTax,
			String with_hold, String incomeTax, String other_deduction,
			String totalDeduction, String pf, String month,String ModifiedDate,
			 String year, String empCode) {
		// TODO Auto-generated method stub
		List<EmpDeductionVo> empDeduUpadateLists = new ArrayList<EmpDeductionVo>();
		try{ 	
			 Connection connection ;
			 Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");
			 
			
			 PreparedStatement ps = connection.prepareStatement("update texon.deductioninfo set prof_tax=?,with_hold=?, income_tax=?, other_deduction=?, total_deduction=?,pf=?,month=?, modification_date=?,year=?,emp_code=? where emp_code=? ");
			 
			 ps.setString(1, profTax);
	         ps.setString(2, with_hold);
	         ps.setString(3, incomeTax);
	         ps.setString(4, other_deduction);
	         ps.setString(5, totalDeduction);
	         ps.setString(6, pf);
	         ps.setString(7, month);
	         ps.setString(8, ModifiedDate);
	         ps.setString(9, year);
	         ps.setString(10, empCode);
	         ps.setString(11, id);
	         ps.executeUpdate();
	       
			}
			catch(SQLException|ClassNotFoundException  e)
			{
				e.printStackTrace();
			}
		return empDeduUpadateLists;
	}

	public static List<EmpDeductionVo> empDeduListget() {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		
		List<EmpDeductionVo> empDedusListget = new ArrayList<EmpDeductionVo>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String emp_details_query = "select * from texon.deductioninfo";
			ResultSet emp_details_rs = stmt.executeQuery(emp_details_query);
			while(emp_details_rs.next()){
				EmpDeductionVo reg = new EmpDeductionVo();
				reg.setProfTax(emp_details_rs.getDouble("prof_tax"));
				reg.setWithHold(emp_details_rs.getDouble("with_hold"));
				reg.setIncomeTax(emp_details_rs.getDouble("income_tax"));
				reg.setOtherDeduction(emp_details_rs.getDouble("other_deduction"));
				reg.setTotalDeduction(emp_details_rs.getDouble("total_deduction"));
				reg.setPf(emp_details_rs.getDouble("pf"));
				reg.setMonth(emp_details_rs.getDate("month"));
				reg.setYear(emp_details_rs.getDate("year"));
				reg.setModifiedDate(emp_details_rs.getDate("modification_date"));
				reg.setEmp_code(emp_details_rs.getString("emp_code"));
				
				empDedusListget.add(reg);
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		return empDedusListget;
	}

	public static List<EmpDeductionVo> empDeduwDisplaytBy(String d1) {
		// TODO Auto-generated method stub
	Connection connection = null;
		
		List<EmpDeductionVo> empDedusList = new ArrayList<EmpDeductionVo>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String emp_details_query = "select * from texon.deductioninfo  where emp_code='"+d1+"'";
			ResultSet emp_details_rs = stmt.executeQuery(emp_details_query);
			while(emp_details_rs.next()){
				EmpDeductionVo reg = new EmpDeductionVo();
				reg.setDedId(emp_details_rs.getInt("deduction_id"));
				reg.setProfTax(emp_details_rs.getDouble("prof_tax"));
				reg.setWithHold(emp_details_rs.getDouble("with_hold"));
				reg.setIncomeTax(emp_details_rs.getDouble("income_tax"));
				reg.setOtherDeduction(emp_details_rs.getDouble("other_deduction"));
				reg.setTotalDeduction(emp_details_rs.getDouble("total_deduction"));
				reg.setPf(emp_details_rs.getDouble("pf"));
				reg.setMonth(emp_details_rs.getDate("month"));
				reg.setYear(emp_details_rs.getDate("year"));
				reg.setModifiedDate(emp_details_rs.getDate("modification_date"));
				reg.setEmp_code(emp_details_rs.getString("emp_code"));
				
				empDedusList.add(reg);
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		return empDedusList;
	
	}

	public static List<SalaryVo> empSalaryListget() {
		// TODO Auto-generated method stub

		Connection connection = null;
		
		List<SalaryVo> empSalaryListget = new ArrayList<SalaryVo>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String emp_details_query = "select * from texon.salary_info";
			ResultSet emp_details_rs = stmt.executeQuery(emp_details_query);
			while(emp_details_rs.next()){
				SalaryVo reg = new SalaryVo();
				reg.setMonthOfSalary(emp_details_rs.getDate("month_of_salary"));
				reg.setYearOfSalary(emp_details_rs.getDate("year_of_salary"));
				reg.setDateOfSalaryPay(emp_details_rs.getDate("date_of_salary_pay"));
				reg.setNetPay(emp_details_rs.getDouble("net_pay"));
				reg.setWorkingDays(emp_details_rs.getInt("total_working_days"));
				reg.setEffDaysWork(emp_details_rs.getInt("eff_days_work"));
				reg.setEmp_code(emp_details_rs.getString("emp_code"));
				
				
				empSalaryListget.add(reg);
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		return empSalaryListget;

	}

	public static List<SalaryVo> empSalaryDisplaytBy(String d1) {
		Connection connection=null;
		List<SalaryVo> empSalDetailList = new ArrayList<SalaryVo>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String emp_details_query = "select * from texon.salary_info  where emp_code='"+d1+"'";
			ResultSet emp_details_rs = stmt.executeQuery(emp_details_query);
			while(emp_details_rs.next()){
				SalaryVo reg = new SalaryVo();
				reg.setMonthOfSalary(emp_details_rs.getDate("month_of_salary"));
				reg.setYearOfSalary(emp_details_rs.getDate("year_of_salary"));
				reg.setDateOfSalaryPay(emp_details_rs.getDate("date_of_salary_pay"));
				reg.setNetPay(emp_details_rs.getDouble("net_pay"));
				reg.setWorkingDays(emp_details_rs.getInt("total_working_days"));
				reg.setEffDaysWork(emp_details_rs.getInt("eff_days_work"));
				reg.setEmp_code(emp_details_rs.getString("emp_code"));
				
				
				empSalDetailList.add(reg);
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		return empSalDetailList;
		}

	@Override
	public List<SalaryVo> updateEmpDedData(String emp_code,
			String month_Of_Salary, String year_of_salary,
			String date_of_salary_pay, String net_pay, String working_days,
			String eff_days_work) {
		List<SalaryVo> addSalListget = new ArrayList<SalaryVo>();
		try{ 	
			 Connection connection ;
			 Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");

			
			 PreparedStatement ps = connection.prepareStatement("insert into texon.salary_info(`month_of_salary`,`year_of_salary`,`date_of_salary_pay`,`net_pay`,`total_working_days`,`eff_days_work`,`emp_code`) values (?,?,?,?,?,?,?)");
	        
	        ps.setString(1, month_Of_Salary);
	        ps.setString(2, year_of_salary);
	        ps.setString(3, date_of_salary_pay);
	        ps.setString(4, net_pay);
	        ps.setString(5, working_days);
	        ps.setString(6, eff_days_work);
	        ps.setString(7, emp_code);
	        
	         ps.executeUpdate();
	        
	     
	       
			}
			catch(SQLException|ClassNotFoundException  e)
			{
				e.printStackTrace();
			}
		return addSalListget;

	}

	public static List<SalaryVo> salaryUpdateList(String id,
			String monthOfSalary, String yearOfSalary, String dateOfSalary_pay,
			String netPay, String workingDays, String effDays_work,
			String empCode) {
		// TODO Auto-generated method stub
		List<SalaryVo> salaryUpdateList = new ArrayList<SalaryVo>();
		try{ 	
			 Connection connection ;
			 Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/texon", "root", "anand");
			 
			
			 PreparedStatement ps = connection.prepareStatement("update texon.deductioninfo set month_of_salary=?,year_of_salary=?, date_of_salary_pay=?, net_pay=?, total_working_days=?,eff_days_work=?,emp_code=? where emp_code=? ");
			 
			 ps.setString(1, monthOfSalary);
	         ps.setString(2, yearOfSalary);
	         ps.setString(3, dateOfSalary_pay);
	         ps.setString(4, netPay);
	         ps.setString(5, workingDays);
	         ps.setString(6, effDays_work);
	         ps.setString(7, empCode);
	         ps.setString(8, id);
	        
	         ps.executeUpdate();
	       
			}
			catch(SQLException|ClassNotFoundException  e)
			{
				e.printStackTrace();
			}
		return salaryUpdateList;
		
	}

	
	}

