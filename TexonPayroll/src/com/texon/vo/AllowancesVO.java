package com.texon.vo;

import java.util.Date;

public class AllowancesVO {
	Integer AllowId;
	Integer Empid;
	double Basic;
	double Hra;
	double ConveyAllow;
	double MedicalAllow;
	double SpecialAllow;
	double MonthlyIncentive;
	double Perquisites;
	double Gross;
	double BalanceForward;
	double Reimbursement;
	double ChildEduAllow;
	
	
	double Totalallow;
	Date year;
	Date month;
	Date ModiDate;
	
	public Integer getAllowId() {
		return AllowId;
	}
	public void setAllowId(Integer allowid) {
		AllowId = allowid;
	}
	public Integer getEmpid() {
		return Empid;
	}
	public void setEmpid(Integer empid) {
		Empid = empid;
	}
	public double getBasic() {
		return Basic;
	}
	public void setBasic(double basic) {
		Basic = basic;
	}
	public double getHra() {
		return Hra;
	}
	public void setHra(double hra) {
		Hra = hra;
	}
	public double getConveyAllow() {
		return ConveyAllow;
	}
	public void setConveyAllow(double conveyAllow) {
		ConveyAllow = conveyAllow;
	}
	public double getMedicalAllow() {
		return MedicalAllow;
	}
	public void setMedicalAllow(double medicalAllow) {
		MedicalAllow = medicalAllow;
	}
	public double getSpecialAllow() {
		return SpecialAllow;
	}
	public void setSpecialAllow(double specialAllow) {
		SpecialAllow = specialAllow;
	}
	public double getMonthlyIncentive() {
		return MonthlyIncentive;
	}
	public void setMonthlyIncentive(double monthlyIncentive) {
		MonthlyIncentive = monthlyIncentive;
	}
	public double getPerquisites() {
		return Perquisites;
	}
	public void setPerquisites(double perquisites) {
		Perquisites = perquisites;
	}
	public double getGross() {
		return Gross;
	}
	public void setGross(double gross) {
		Gross = gross;
	}
	public double getBalanceForward() {
		return BalanceForward;
	}
	public void setBalanceForward(double balanceForward) {
		BalanceForward = balanceForward;
	}
	public double getReimbursement() {
		return Reimbursement;
	}
	public void setReimbursement(double reimbursement) {
		Reimbursement = reimbursement;
	}
	public double getTotalallow() {
		return Totalallow;
	}
	public void setTotalallow(double totalallow) {
		Totalallow = totalallow;
	}
	
	public Date getMonth() {
		return month;
	}
	public void setMonth(Date month) {
		this.month = month;
	}
	public Date getModiDate() {
		return ModiDate;
	}
	public void setModiDate(Date modiDate) {
		ModiDate = modiDate;
	}
	
	
	public double getChildEduAllow() {
		return ChildEduAllow;
	}
	public void setChildEduAllow(double childEduAllow) {
		ChildEduAllow = childEduAllow;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
}
