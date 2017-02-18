package payroll.vo;

import java.sql.Date;

public class EmpAllowances {
	Integer allowId;
	Integer empId;
	Double basic;
	Double hra;
	Double conveyAllow;
	Double medicalAllow;
	Double specialAllow;
	Double monthlyIncentive;
	Double perquisites;
	Double childEduAllow;
	Double gross;
	Double balanceForward;
	Double reimbursement;
	Double totalAllow;
	Date month;
	Date year;
	
	Date modifiedDate;
	String emp_code;
	
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	
	public String getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}
	public Integer getAllowId() {
		return allowId;
	}
	public void setAllowId(Integer allowId) {
		this.allowId = allowId;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Double getBasic() {
		return basic;
	}
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	public Double getHra() {
		return hra;
	}
	public void setHra(Double hra) {
		this.hra = hra;
	}
	public Double getConveyAllow() {
		return conveyAllow;
	}
	public void setConveyAllow(Double conveyAllow) {
		this.conveyAllow = conveyAllow;
	}
	public Double getMedicalAllow() {
		return medicalAllow;
	}
	public void setMedicalAllow(Double medicalAllow) {
		this.medicalAllow = medicalAllow;
	}
	public Double getSpecialAllow() {
		return specialAllow;
	}
	public void setSpecialAllow(Double specialAllow) {
		this.specialAllow = specialAllow;
	}
	public Double getMonthlyIncentive() {
		return monthlyIncentive;
	}
	public void setMonthlyIncentive(Double monthlyIncentive) {
		this.monthlyIncentive = monthlyIncentive;
	}
	public Double getPerquisites() {
		return perquisites;
	}
	public void setPerquisites(Double perquisites) {
		this.perquisites = perquisites;
	}
	public Double getChildEduAllow() {
		return childEduAllow;
	}
	public void setChildEduAllow(Double childEduAllow) {
		this.childEduAllow = childEduAllow;
	}
	public Double getGross() {
		return gross;
	}
	public void setGross(Double gross) {
		this.gross = gross;
	}
	public Double getBalanceForward() {
		return balanceForward;
	}
	public void setBalanceForward(Double balanceForward) {
		this.balanceForward = balanceForward;
	}
	public Double getReimbursement() {
		return reimbursement;
	}
	public void setReimbursement(Double reimbursement) {
		this.reimbursement = reimbursement;
	}
	public Double getTotalAllow() {
		return totalAllow;
	}
	public void setTotalAllow(Double totalAllow) {
		this.totalAllow = totalAllow;
	}
	public Date getMonth() {
		return month;
	}
	public void setMonth(Date month) {
		this.month = month;
	}
	

	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
