package payroll.daolempl;

import java.util.List;

import payroll.service.Service;


import payroll.serviceempl.LoginData;
import payroll.dao.Dao;
import payroll.vo.EmpAllowances;
import payroll.vo.EmpDeductionVo;
import payroll.vo.EmpListVO;
import payroll.vo.SalaryVo;

public class Daolempl implements Dao {

	public List<EmpListVO> addEmpData(String empName, String presentadd,
			String city, String pincode, String permanantaddrss, String phnum,
			String mobnum, String bloodgroup, String nationality,
			String languageknown, String pancardNum, String emptype,
			String empgrade, String empcode, String empsignature) {
		Service service = new LoginData();
		List<EmpListVO> empUserAdd = service.addEmpData(empName,  presentadd,
				 city,  pincode,  permanantaddrss,  phnum,
				 mobnum,  bloodgroup,  nationality,
				 languageknown,  pancardNum,  emptype,
				 empgrade,  empcode,  empsignature);
		return empUserAdd;
		
		
		
		// TODO Auto-generated method stub
		
	}

	

//	@Override
//	public List<EmpListVO> updateList(String Id, String empName,
//			String presentadd, String city, String pincode,
//			String permanantaddrss, String phnum, String mobnum,
//			String bloodgroup, String nationality, String languageknown,
//			String pancardNum, String emptype, String empgrade, String empcode,
//			String empsignature) {
//		// TODO Auto-generated method stub
//		Service service = new LoginData();
//		List<EmpListVO> empUserupdateList = service.updateList(Id, empName,  presentadd,
//				 city,  pincode,  permanantaddrss,  phnum,
//				 mobnum,  bloodgroup,  nationality,
//				 languageknown, pancardNum,  emptype,
//				 empgrade,  empcode,  empsignature);
//		return empUserupdateList;
//	}



	@Override
	public List<EmpListVO> updateList(String id, String empName,
			String presentadd, String city, String pincode,
			String permanantaddrss, String phnum, String mobnum,
			String bloodgroup, String nationality, String languageknown,
			String pancardNum, String emptype, String empgrade, String empcode,
			String empsignature) {
		// TODO Auto-generated method stub
		Service service = new LoginData();
		List<EmpListVO> empUserupdateList = service.updateList(id, empName,  presentadd,
				 city,  pincode,  permanantaddrss,  phnum,
				 mobnum,  bloodgroup,  nationality,
				 languageknown, pancardNum,  emptype,
				 empgrade,  empcode,  empsignature);
		return empUserupdateList;
		
	}



	@Override
	public List<EmpAllowances> addEmpAllowData(String basic, String hRA,
			String conveyanceAllowances, String medicalAlowances,
			String specialAllowances, String monthlyIncentive,
			String perquisites, String childEduAllow, String gross,
			String balanceForward, String reimbursement, String totalAllow,
			String month, String year, String modifiedDate,String EmpCode) {
		// TODO Auto-generated method stub
		Service service = new LoginData();
		List<EmpAllowances> empAllowList = service.addEmpAllowData(basic,hRA,conveyanceAllowances,medicalAlowances,
				specialAllowances,monthlyIncentive,perquisites,childEduAllow,gross,balanceForward,reimbursement,
				totalAllow,month,year,modifiedDate,EmpCode);
		return empAllowList;
	}



	@Override
	public List<EmpAllowances> AllowupdateList(String id, String basic, String hRA,
			String conveyanceAllowances, String medicalAlowances,
			String specialAllowances, String monthlyIncentive,
			String perquisites, String childEduAllow, String gross,
			String balanceForward, String reimbursement, String totalAllow,
			String month, String year, String modifiedDate, String empCode) {
		// TODO Auto-generated method stub
		Service service = new LoginData();
		List<EmpAllowances> empUpadatAllwoList = service.AllowupdateList(id,basic,hRA,conveyanceAllowances, medicalAlowances,
			specialAllowances,monthlyIncentive,perquisites,childEduAllow,gross,balanceForward,reimbursement,totalAllow,
			month,year,modifiedDate,empCode);
		return empUpadatAllwoList;
	}



	@Override
	public List<EmpDeductionVo> addEmpDeduData(String ProfTax, String with_hold,String incomeTax,
			String other_deduction, String totalDeduction, String pf,
			String month,String year, String ModifiedDate, String empCode) {
		// TODO Auto-generated method stub
		Service service = new LoginData();
		List<EmpDeductionVo> empAddDeduList = service.EmpDeduList(ProfTax,
				with_hold,incomeTax,other_deduction,totalDeduction,pf, month,
				ModifiedDate,year,empCode);
		return empAddDeduList;
	}



	@Override
	public List<EmpDeductionVo> updateEmpDeduData(String id, String profTax,
			String with_hold, String incomeTax, String other_deduction,
			String totalDeduction, String pf, String month,
			String ModifiedDate,
			String year, String empCode) {
		// TODO Auto-generated method stub
		Service service = new LoginData();
		List<EmpDeductionVo> empUpdateList = service.updateEmpDedData(id,profTax,
				with_hold,incomeTax,other_deduction,totalDeduction,pf, month,ModifiedDate,
				year,empCode);
		
		
		return empUpdateList;
	}



	@Override
	public List<SalaryVo> addEmpSalData(String emp_code,
			String month_Of_Salary, String year_of_salary,
			String date_of_salary_pay, String net_pay, String working_days,
			String eff_days_work) {
		// TODO Auto-generated method stub
		Service service = new LoginData();
		List<SalaryVo> empSalList = service.updateEmpDedData(emp_code,month_Of_Salary,year_of_salary,
				date_of_salary_pay,net_pay,working_days,eff_days_work);
		
		return empSalList;
	}













}
