package com.texon.vo;

import java.sql.Date;

public class SalaryVO {

	
	Integer SalaryId;
	Integer AllowId;
	Integer DedId;
	Integer EmpId;
	Integer LeaveId;
Date MonthOfSalary;
Date YearOfSalary;
Date DateOfSalaryPay;
Double NetPay;
Integer WorkingDays;
Integer EffDaysWork;
public Integer getSalaryId() {
	return SalaryId;
}
public void setSalaryId(Integer salaryId) {
	SalaryId = salaryId;
}
public Integer getAllowId() {
	return AllowId;
}
public void setAllowId(Integer allowId) {
	AllowId = allowId;
}
public Integer getDedId() {
	return DedId;
}
public void setDedId(Integer dedId) {
	DedId = dedId;
}
public Integer getEmpId() {
	return EmpId;
}
public void setEmpId(Integer empId) {
	EmpId = empId;
}
public Integer getLeaveId() {
	return LeaveId;
}
public void setLeaveId(Integer leaveId) {
	LeaveId = leaveId;
}
public Date getMonthOfSalary() {
	return MonthOfSalary;
}
public void setMonthOfSalary(Date monthOfSalary) {
	MonthOfSalary = monthOfSalary;
}
public Date getYearOfSalary() {
	return YearOfSalary;
}
public void setYearOfSalary(Date yearOfSalary) {
	YearOfSalary = yearOfSalary;
}
public Date getDateOfSalaryPay() {
	return DateOfSalaryPay;
}
public void setDateOfSalaryPay(Date dateOfSalaryPay) {
	DateOfSalaryPay = dateOfSalaryPay;
}
public Double getNetPay() {
	return NetPay;
}
public void setNetPay(Double netPay) {
	NetPay = netPay;
}
public Integer getWorkingDays() {
	return WorkingDays;
}
public void setWorkingDays(Integer workingDays) {
	WorkingDays = workingDays;
}
public Integer getEffDaysWork() {
	return EffDaysWork;
}
public void setEffDaysWork(Integer effDaysWork) {
	EffDaysWork = effDaysWork;
}


}
