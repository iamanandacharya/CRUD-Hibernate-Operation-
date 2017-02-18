package payroll.vo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.mysql.jdbc.Blob;

public class EmpListVO implements Serializable{
	 /**
	  * 
	  */
private static final long serialVersionUID = -1380082535619688360L;
	String empName;
	String gender;
	String present_add;
	String city;
	String pincode;
	String state;
	String permanant_addrss;
	String ph_num;
	String mob_num;
	
	
	String blood_group;
	String nationality;
	String language_known;
	String pan_card_num;
	

	String department_id;
	String designation;
	String emp_type;
	String emp_grade;
	String emp_image;
	String emp_signature;
	Integer Id;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	String bank_id;
	String org_id;
	String emp_code;
	String Email;
	java.sql.Blob Image;
	
	public java.sql.Blob getImage() {
		return Image;
	}
	public void setImage(java.sql.Blob blob) {
		Image = blob;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	Date birth_of_date;
	Date confom_date;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPresent_add() {
		return present_add;
	}
	public void setPresent_add(String present_add) {
		this.present_add = present_add;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPermanant_addrss() {
		return permanant_addrss;
	}
	public void setPermanant_addrss(String permanant_addrss) {
		this.permanant_addrss = permanant_addrss;
	}
	public String getPh_num() {
		return ph_num;
	}
	public void setPh_num(String ph_num) {
		this.ph_num = ph_num;
	}
	public String getMob_num() {
		return mob_num;
	}
	public void setMob_num(String mob_num) {
		this.mob_num = mob_num;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getLanguage_known() {
		return language_known;
	}
	public void setLanguage_known(String language_known) {
		this.language_known = language_known;
	}
	public String getPan_card_num() {
		return pan_card_num;
	}
	public void setPan_card_num(String pan_card_num) {
		this.pan_card_num = pan_card_num;
	}
	public String getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmp_type() {
		return emp_type;
	}
	public void setEmp_type(String emp_type) {
		this.emp_type = emp_type;
	}
	public String getEmp_grade() {
		return emp_grade;
	}
	public void setEmp_grade(String emp_grade) {
		this.emp_grade = emp_grade;
	}
	public String getEmp_image() {
		return emp_image;
	}
	public void setEmp_image(String emp_image) {
		this.emp_image = emp_image;
	}
	public String getEmp_signature() {
		return emp_signature;
	}
	public void setEmp_signature(String emp_signature) {
		this.emp_signature = emp_signature;
	}
	
	public String getBank_id() {
		return bank_id;
	}
	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}
	public String getOrg_id() {
		return org_id;
	}
	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}
	public String getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}
	public Date getBirth_of_date() {
		return birth_of_date;
	}
	public void setBirth_of_date(Date birth_of_date) {
		this.birth_of_date = birth_of_date;
	}
	public Date getConfom_date() {
		return confom_date;
	}
	public void setConfom_date(Date confom_date) {
		this.confom_date = confom_date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	}