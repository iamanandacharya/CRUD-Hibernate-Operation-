package com.texon.servicempl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


import com.texon.Dao.Dao;
import com.texon.connection.InitConnection;
import com.texon.service.Service;
import com.texon.vo.AllowancesVO;
import com.texon.vo.BankVO;
import com.texon.vo.DeductionVO;
import com.texon.vo.EmpListVO;
import com.texon.vo.SalaryVO;

public class ServicImpl implements Service{
	
	
	public List<EmpListVO> empListgetBy(String name){
		Connection connection = null;
		
		List<EmpListVO> empList = new ArrayList<EmpListVO>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String emp_details_query =  "select * from texon.employeeinfo  where emp_code="+name;
			ResultSet emp_details_rs = stmt.executeQuery(emp_details_query);
			while(emp_details_rs.next()){
				EmpListVO elVo = new EmpListVO();
				elVo.setEmpName(emp_details_rs.getString("emp_name"));
				elVo.setCity(emp_details_rs.getString("city"));
				elVo.setEmp_code(emp_details_rs.getString("emp_code"));
				elVo.setDesignation(emp_details_rs.getString("designation"));
				empList.add(elVo);
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return empList;
	}
	
	
	public boolean login(String userName , String password){
		Connection connection = null;
		boolean result = false;
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String emp_details_query = "select * from texon.registration_info where user_name='"+userName+"' and password="+password;
			ResultSet emp_details_rs = stmt.executeQuery(emp_details_query);
			while(emp_details_rs.next()){
				result = true;
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return result;
	}


	@Override
	public List<EmpListVO> empAllUserView(String name) {
         Connection connection = null;
		List<EmpListVO> empList = new ArrayList<EmpListVO>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String emp_details_query =  "select * from texon.employeeinfo  where emp_code='"+name+"'";
			ResultSet emp_details_rs = stmt.executeQuery(emp_details_query);
			while(emp_details_rs.next()){
				EmpListVO elVo = new EmpListVO();
				elVo.setEmpName(emp_details_rs.getString("emp_name"));
				elVo.setCity(emp_details_rs.getString("city"));
				elVo.setEmp_code(emp_details_rs.getString("emp_code"));
				elVo.setDesignation(emp_details_rs.getString("designation"));
//				elVo.setCity(emp_details_rs.getString("city"));
//				elVo.setEmp_code(emp_details_rs.getString("emp_code"));
//				elVo.setDesignation(emp_details_rs.getString("designation"));
				empList.add(elVo);
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return empList;
	}


	@Override
	public List<BankVO> BankAllUserView(String name) {
		// TODO Auto-generated method stub
		Connection connection = null;
		List<BankVO> bankLst = new ArrayList<BankVO>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String bank_details_query =  "select * from texon.bankinfo  where bank_name='"+name+"'";
			ResultSet bank_details_rs = stmt.executeQuery(bank_details_query);
			while(bank_details_rs.next()){
				BankVO elVo = new BankVO();
				elVo.setBankName(bank_details_rs.getString("bank_name"));
				elVo.setBankAccNum(bank_details_rs.getString("bank_acc_num"));
				elVo.setBankAccType(bank_details_rs.getString("bank_acc_type"));
				elVo.setBankAddress(bank_details_rs.getString("bank_address"));
				elVo.setBranchName(bank_details_rs.getString("branch_name"));
				elVo.setModeOfPay(bank_details_rs.getString("mode_of_pay"));
			
				bankLst.add(elVo);
			
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		return bankLst;
	}


	@Override
	public List<DeductionVO> deductionUserView(String name) {
		// TODO Auto-generated method stub
		Connection connection = null;
		List<DeductionVO> deduList = new ArrayList<DeductionVO>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String dedu_details_query =  "select * from texon.deductioninfo  where emp_id='"+name+"'";
			ResultSet dedu_details_rs = stmt.executeQuery(dedu_details_query);
			while(dedu_details_rs.next()){
				DeductionVO deduVo = new DeductionVO();
				deduVo.setDedId(dedu_details_rs.getInt("deduction_id"));
				deduVo.setEmpId(dedu_details_rs.getInt("emp_id"));
				deduVo.setProfTax(dedu_details_rs.getDouble("prof_tax"));
				deduVo.setIncomeTax(dedu_details_rs.getDouble("income_tax"));
				
				deduVo.setOtherDeduction(dedu_details_rs.getDouble("other_deduction"));
				
				deduVo.setTotalDeduction(dedu_details_rs.getDouble("total_deduction"));
				deduVo.setMonth(dedu_details_rs.getDate("month"));
				deduVo.setYear(dedu_details_rs.getDate("year"));
				deduVo.setModificationDate(dedu_details_rs.getDate("modification_date"));
				
				deduVo.setPF(dedu_details_rs.getDouble("pf"));
				deduList.add(deduVo);
			
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		return deduList;
	}


	@Override
	public List<AllowancesVO> AllowAllUserView(String name) {
		// TODO Auto-generated method stub
		Connection connection = null;
		List<AllowancesVO> allowList = new ArrayList<AllowancesVO>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String allow_details_query =  "select * from texon.emp_allowances  where emp_id='"+name+"'";
			ResultSet allow_details_rs = stmt.executeQuery(allow_details_query);
			while(allow_details_rs.next()){
				AllowancesVO allowVo = new AllowancesVO();
				allowVo.setAllowId(allow_details_rs.getInt("allow_id"));
				allowVo.setEmpid(allow_details_rs.getInt("emp_id"));
				allowVo.setBasic(allow_details_rs.getDouble("basic"));
				allowVo.setHra(allow_details_rs.getDouble("HRA"));
				allowVo.setConveyAllow(allow_details_rs.getDouble("convey_allow"));
				allowVo.setMedicalAllow(allow_details_rs.getDouble("medical_allow"));
				allowVo.setSpecialAllow(allow_details_rs.getDouble("special_allow"));
				allowVo.setMonthlyIncentive(allow_details_rs.getDouble("monthly_incentive"));
				allowVo.setPerquisites(allow_details_rs.getDouble("perquisites"));
				allowVo.setChildEduAllow(allow_details_rs.getDouble("child_edu_allow"));
				allowVo.setGross(allow_details_rs.getDouble("gross"));
				allowVo.setBalanceForward(allow_details_rs.getDouble("balance_forward"));
				allowVo.setReimbursement(allow_details_rs.getDouble("reimbursement"));
				allowVo.setTotalallow(allow_details_rs.getDouble("total_allow"));
				allowVo.setMonth(allow_details_rs.getDate("month"));
				allowVo.setYear(allow_details_rs.getDate("year"));
				allowVo.setModiDate(allow_details_rs.getDate("modified_date"));
			
				
				allowList.add(allowVo);
			
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		return allowList;
	}


	@Override
	public List<SalaryVO> salaryAllUserView(String name) {
		// TODO Auto-generated method stub
		Connection connection = null;
		List<SalaryVO> salList = new ArrayList<SalaryVO>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String sal_details_query =  "select * from texon.salary_info  where salary_id='"+name+"'";
			ResultSet sal_details_rs = stmt.executeQuery(sal_details_query);
			while(sal_details_rs.next()){
				SalaryVO salryempVo = new SalaryVO();
				salryempVo.setSalaryId(sal_details_rs.getInt("salary_id"));
				salryempVo.setAllowId(sal_details_rs.getInt("allow_id"));
				salryempVo.setEmpId(sal_details_rs.getInt("emp_id"));
				salryempVo.setDedId(sal_details_rs.getInt("ded_id"));
				salryempVo.setMonthOfSalary(sal_details_rs.getDate("month_of_salary"));
				salryempVo.setYearOfSalary(sal_details_rs.getDate("year_of_salary"));
				salryempVo.setDateOfSalaryPay(sal_details_rs.getDate("date_of_salary_pay"));
				salryempVo.setNetPay(sal_details_rs.getDouble("net_pay"));
				salryempVo.setWorkingDays(sal_details_rs.getInt("working_days"));
				salryempVo.setEffDaysWork(sal_details_rs.getInt("eff_days_work"));
				
				salryempVo.setLeaveId(sal_details_rs.getInt("leave_id"));
				
	
			
			
				
				salList.add(salryempVo);
			
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		return salList;
	}


	@Override
	public List<EmpListVO> empAllUserView() {
		// TODO Auto-generated method stub
		Connection connection = null;
		List<EmpListVO> empLists = new ArrayList<EmpListVO>();
		try{
			connection = InitConnection.connection();
			Statement stmt = connection.createStatement();
			String emp_list_query ="select * from texon.employeeinfo";
			ResultSet eml_list_reslutlSet= stmt.executeQuery(emp_list_query);
			while(eml_list_reslutlSet.next())
			{
				EmpListVO elVoo = new EmpListVO();
				elVoo.setEmp_code(eml_list_reslutlSet.getString("emp_code"));
				elVoo.setEmpName(eml_list_reslutlSet.getString("emp_name"));
				elVoo.setDesignation(eml_list_reslutlSet.getString("designation"));
				elVoo.setCity(eml_list_reslutlSet.getString("city"));
				empLists.add(elVoo);
			}
			
		}catch(SQLException ex){
			System.err.println(ex);
		}
		return null;
	}


	@Override
	public List<EmpListVO> empUserView(String name) {
		// TODO Auto-generated method stub
Connection connection = null;
		
		List<EmpListVO> empList = new ArrayList<EmpListVO>();
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String emp_details_query =  "select * from texon.employeeinfo  where emp_code='"+name+"'";
			ResultSet emp_details_rs = stmt.executeQuery(emp_details_query);
			while(emp_details_rs.next()){
				EmpListVO elVo = new EmpListVO();
				elVo.setEmpName(emp_details_rs.getString("emp_name"));
				elVo.setCity(emp_details_rs.getString("city"));
				elVo.setEmp_code(emp_details_rs.getString("emp_code"));
				elVo.setDesignation(emp_details_rs.getString("designation"));
				empList.add(elVo);
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return empList;
		
	}


	@Override
	public List<EmpListVO> empDisplayView() {
		// TODO Auto-generated method stub
		Connection connection = null;
		List<EmpListVO> empList = new ArrayList<EmpListVO>();
		List<EmpListVO> emplLinkList = new ArrayList<EmpListVO>();
		try{
			connection = InitConnection.connection();
		Statement stmt = connection.createStatement();
		String emp_display_query = "select * from texon.employeeinfo order by emp_code asc;";
		ResultSet emp_display_rs = stmt.executeQuery(emp_display_query);
			while(emp_display_rs.next()) {
				EmpListVO elVo = new EmpListVO();
				elVo.setEmpName(emp_display_rs.getString("emp_name"));
				elVo.setCity(emp_display_rs.getString("emp_code"));
				elVo.setEmp_code(emp_display_rs.getString("emp_code"));
				elVo.setDesignation(emp_display_rs.getString("designation"));
				elVo.setPan_card_num(emp_display_rs.getString("pan_card_num"));
				elVo.setPan_card_num(emp_display_rs.getString("pan_card_num"));
				emplLinkList.add(elVo);
			}
		}catch(SQLException ex){
			System.err.println(ex);
		}
		return emplLinkList;
	}


	@Override
	public List<EmpListVO> empUserAdd(String name, String emplName,
			String city, String designation) {
		// TODO Auto-generated method stub
		Connection connection = null;
		String acknowMsg="";
		List<EmpListVO> empLists = new ArrayList<EmpListVO>();
		try{
		connection = InitConnection.connection();
		Statement stmt = connection.createStatement();
		String emp_user_query = "INSERT INTO texon.employeeinfo('emp_id', 'emp_name', 'city', 'emp_code', 'designation') values('emplName', 'city', 'designation')";
		int inserted = 0;
		inserted = stmt.executeUpdate(emp_user_query);
		stmt.close();
	
		if(inserted>0){
			acknowMsg="Data has been inserted!";
		}else{
			acknowMsg="Operation failed!";
		}
		
		
		}
		catch(SQLException ex){
			System.err.println(ex);
		}
		return empLists;
	}


	@Override
	public List<AllowancesVO> AllowAllListView(String name) {
		Connection connection = null;
		
		List<AllowancesVO> allowlists = new LinkedList<AllowancesVO>(); 
		try {
			connection=InitConnection.connection();
			Statement stmt = connection.createStatement();
			String allow_details_query =  "select * from texon.emp_allowances  where emp_id='"+name+"'";
			ResultSet allow_details_rs = stmt.executeQuery(allow_details_query);
			while(allow_details_rs.next()){
				AllowancesVO allowVo = new AllowancesVO();
				allowVo.setAllowId(allow_details_rs.getInt("allow_id"));
				allowVo.setEmpid(allow_details_rs.getInt("emp_id"));
				allowVo.setBasic(allow_details_rs.getDouble("basic"));
				allowVo.setHra(allow_details_rs.getDouble("HRA"));
				allowVo.setConveyAllow(allow_details_rs.getDouble("convey_allow"));
				allowVo.setMedicalAllow(allow_details_rs.getDouble("medical_allow"));
				allowVo.setSpecialAllow(allow_details_rs.getDouble("special_allow"));
				allowVo.setMonthlyIncentive(allow_details_rs.getDouble("monthly_incentive"));
				allowVo.setPerquisites(allow_details_rs.getDouble("perquisites"));
				allowVo.setChildEduAllow(allow_details_rs.getDouble("child_edu_allow"));
				allowVo.setGross(allow_details_rs.getDouble("gross"));
				allowVo.setBalanceForward(allow_details_rs.getDouble("balance_forward"));
				allowVo.setReimbursement(allow_details_rs.getDouble("reimbursement"));
				allowVo.setTotalallow(allow_details_rs.getDouble("total_allow"));
				allowVo.setMonth(allow_details_rs.getDate("month"));
				allowVo.setYear(allow_details_rs.getDate("year"));
				allowVo.setModiDate(allow_details_rs.getDate("modified_date"));
			
				
				allowlists.add(allowVo);
			
			}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		return allowlists;
	}
}
