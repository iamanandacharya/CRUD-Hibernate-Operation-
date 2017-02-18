package model;

import java.sql.Date;
public class Employee {

	private int employeeId;
	private String Name;
	private String	address;
private String gender;
private double	salary;
private Date birth_date;

public Employee() {
	// TODO Auto-generated constructor stub
}

public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String string) {
	this.gender = string;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Date getBirth_date() {
	return birth_date;
}
public void setBirth_date(Date birth_date) {
	this.birth_date = birth_date;
}

}
