package com.hibernate.student;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Teacher {
	@Id @GeneratedValue//Auto generate Primary key value
	private int teacherId;
	private String teacherName;
	private String teachCode;
/*	@ManyToOne
	private Student std;
	
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}*/
	
	@ManyToMany(cascade = {CascadeType.ALL})
	private List<Student> student;
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	Teacher(int TeacherId, String TeacherName,String TeachCode)
	{
		this.teacherId = TeacherId;
		this.teacherName = TeacherName;
		this.teachCode = TeachCode;
	}
	
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeachCode() {
		return teachCode;
	}
	public void setTeachCode(String teachCode) {
		this.teachCode = teachCode;
	}
	
	
	

}
