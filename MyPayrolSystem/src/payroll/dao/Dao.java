package payroll.dao;

import java.util.List;

import payroll.vo.SalaryVo;
import payroll.vo.EmpAllowances;
import payroll.vo.EmpDeductionVo;
import payroll.vo.EmpListVO;

public interface Dao {

	public List<EmpListVO> addEmpData(String empName, String presentadd, String city,
			String pincode, String permanantaddrss, String phnum,
			String mobnum, String bloodgroup, String nationality,
			String languageknown, String pancardNum, String emptype,
			String empgrade, String empcode, String empsignature);



	



	public List<EmpListVO> updateList(String id, String empName,
			String presentadd, String city, String pincode,
			String permanantaddrss, String phnum, String mobnum,
			String bloodgroup, String nationality, String languageknown,
			String pancardNum, String emptype, String empgrade, String empcode,
			String empsignature);







	public List<EmpAllowances> addEmpAllowData(String basic, String hRA,
			String conveyanceAllowances, String medicalAlowances,
			String specialAllowances, String monthlyIncentive,
			String perquisites, String childEduAllow, String gross,
			String balanceForward, String reimbursement, String totalAllow,
			String month, String year, String modifiedDate, String empCode);







	public List<EmpAllowances> AllowupdateList(String id, String basic, String hRA,
			String conveyanceAllowances, String medicalAlowances,
			String specialAllowances, String monthlyIncentive,
			String perquisites, String childEduAllow, String gross,
			String balanceForward, String reimbursement, String totalAllow,
			String month, String year, String modifiedDate, String empCode);







	public List<EmpDeductionVo> addEmpDeduData( String ProfTax, String with_hold,String incomeTax,
			String other_deduction, String totalDeduction, String pf,
			String month,String year,String ModifiedDate, String empCode );







	public List<EmpDeductionVo> updateEmpDeduData(String id, String profTax,
			String with_hold, String incomeTax, String other_deduction,
			String totalDeduction, String pf, String month,
			String ModifiedDate,
			  String year, String empCode);







	public List<payroll.vo.SalaryVo> addEmpSalData(String emp_code,
			String month_Of_Salary, String year_of_salary,
			String date_of_salary_pay, String net_pay, String working_days,
			String eff_days_work);







}
