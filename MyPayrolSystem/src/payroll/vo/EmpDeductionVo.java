package payroll.vo;

import java.sql.Date;

public class EmpDeductionVo {

	Integer dedId;
	Integer empId;
	Double profTax;
	Double withHold;
	Double incomeTax;
	Double otherDeduction;
	Double totalDeduction;
	Double pf;
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
	public Integer getDedId() {
		return dedId;
	}
	public void setDedId(Integer dedId) {
		this.dedId = dedId;
	}
	public Integer getEmpId()
	{
		return empId;
	}
	public void setEmpId(Integer empId)
	{
		this.empId=empId;
	}
	public Double getProfTax() {
		return profTax;
	}
	public void setProfTax(Double profTax) {
		this.profTax = profTax;
	}
	public Double getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(Double incomeTax)
	{
		this.incomeTax=incomeTax;
	}
	public Double getWithHold() {
		return withHold;
	}
	public void setWithHold(Double withHold) {
		this.withHold = withHold;
	}
	public Double getOtherDeduction() {
		return otherDeduction;
	}
	public void setOtherDeduction(Double otherDeduction) {
		this.otherDeduction = otherDeduction;
	}
	public Double getTotalDeduction() {
		return totalDeduction;
	}
	public void setTotalDeduction(Double totalDeduction) {
		this.totalDeduction = totalDeduction;
	}
	public Double getPf() {
		return pf;
	}
	public void setPf(Double pf) {
		this.pf = pf;
	}
	
	public Date getMonth()
	{
		return month;
	}
	public void setMonth(Date month)
	{
		this.month = month;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
