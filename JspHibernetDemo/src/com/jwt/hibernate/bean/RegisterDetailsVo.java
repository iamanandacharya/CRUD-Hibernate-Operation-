package com.jwt.hibernate.bean;

import java.sql.Blob;
import java.sql.Date;
public class RegisterDetailsVo {
	public int Id;
	public String Name;
	public String Password;
	public Date Date;
	public String Address;
	public String PhoneNumber;
	public String Email;
	public Blob Image;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Blob getImage() {
		return Image;
	}
	public void setImage(Blob image) {
		Image = image;
	}
}
