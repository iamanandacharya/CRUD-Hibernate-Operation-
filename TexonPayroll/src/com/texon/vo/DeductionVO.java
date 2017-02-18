package com.texon.vo;

import java.util.Date;

public class DeductionVO {
	
	double ProfTax;
	double WithHold;
	double IncomeTax;
	double OtherDeduction;
	double TotalDeduction;
	Integer EmpId;
	Integer DedId;
	double PF;
	Date Month;
	Date Year;
	Date ModificationDate;
	public Integer getEmpId() {
		return EmpId;
	}
	public void setEmpId(Integer empId) {
		EmpId = empId;
	}
	public Integer getDedId() {
		return DedId;
	}
	public void setDedId(Integer dedId) {
		DedId = dedId;
	}
	
	public double getProfTax() {
		return ProfTax;
	}
	public void setProfTax(double profTax) {
		ProfTax = profTax;
	}
	public double getWithHold() {
		return WithHold;
	}
	public void setWithHold(double withHold) {
		WithHold = withHold;
	}
	public double getIncomeTax() {
		return IncomeTax;
	}
	public void setIncomeTax(double incomeTax) {
		IncomeTax = incomeTax;
	}
	public double getOtherDeduction() {
		return OtherDeduction;
	}
	public void setOtherDeduction(double otherDeduction) {
		OtherDeduction = otherDeduction;
	}
	public double getTotalDeduction() {
		return TotalDeduction;
	}
	public void setTotalDeduction(double totalDeduction) {
		TotalDeduction = totalDeduction;
	}
	public double getPF() {
		return PF;
	}
	public void setPF(double pF) {
		PF = pF;
	}
	public Date getMonth() {
		return Month;
	}
	public void setMonth(Date month) {
		Month = month;
	}
	public Date getYear() {
		return Year;
	}
	public void setYear(Date year) {
		Year = year;
	}
	public Date getModificationDate() {
		return ModificationDate;
	}
	public void setModificationDate(Date modificationDate) {
		ModificationDate = modificationDate;
	}
	
}
