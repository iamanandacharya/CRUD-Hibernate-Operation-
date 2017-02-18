package payroll.vo;

public class BankInfo {

	Integer bankId;
	Integer empId;
	String bankName;
	String bankAccNum;
	String bankAccType;
	String  bankAddress;
	String branchName;
	String modeOfPay;
	public Integer getBankId() {
		return bankId;
	}
	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAccNum() {
		return bankAccNum;
	}
	public void setBankAccNum(String bankAccNum) {
		this.bankAccNum = bankAccNum;
	}
	public String getBankAccType() {
		return bankAccType;
	}
	public void setBankAccType(String bankAccType) {
		this.bankAccType = bankAccType;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getModeOfPay() {
		return modeOfPay;
	}
	public void setModeOfPay(String modeOfPay) {
		this.modeOfPay = modeOfPay;
	}


}
