package payroll.vo;

import java.sql.Date;

public class SalaryVo {

	Integer salaryId;
	Integer allowId;
	Integer dedId;
	Integer workingDays;
	Integer  effDaysWork;
	Integer empId;
	Integer leaveId;
	Date monthOfSalary;
	Date yearOfSalary;
	Date dateOfSalaryPay;
	Double netPay;
	String emp_code;
	public String getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}
	public Integer getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(Integer salaryId) {
		this.salaryId = salaryId;
	}
	public Integer getAllowId() {
		return allowId;
	}
	public void setAllowId(Integer allowId) {
		this.allowId = allowId;
	}
	public Integer getDedId() {
		return dedId;
	}
	public void setDedId(Integer dedId) {
		this.dedId = dedId;
	}
	public Integer getWorkingDays() {
		return workingDays;
	}
	public void setWorkingDays(Integer workingDays) {
		this.workingDays = workingDays;
	}
	public Integer getEffDaysWork() {
		return effDaysWork;
	}
	public void setEffDaysWork(Integer effDaysWork) {
		this.effDaysWork = effDaysWork;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Integer getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}
	public Date getMonthOfSalary() {
		return monthOfSalary;
	}
	public void setMonthOfSalary(Date monthOfSalary) {
		this.monthOfSalary = monthOfSalary;
	}
	public Date getYearOfSalary() {
		return yearOfSalary;
	}
	public void setYearOfSalary(Date yearOfSalary) {
		this.yearOfSalary = yearOfSalary;
	}
	public Date getDateOfSalaryPay() {
		return dateOfSalaryPay;
	}
	public void setDateOfSalaryPay(Date dateOfSalaryPay) {
		this.dateOfSalaryPay = dateOfSalaryPay;
	}
	public Double getNetPay() {
		return netPay;
	}
	public void setNetPay(Double netPay) {
		this.netPay = netPay;
	}
	
}
