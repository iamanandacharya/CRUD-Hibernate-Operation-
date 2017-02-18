package com.hibernate.student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
@Entity
@Table(name = "student")

public class Student {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)//Auto generate primary key value
	private long id;
	private String name;
	private String degree;
	private String roll;
	private String phone;
	/*
	 * One to One Mapping Example
	 */
	@ManyToMany(cascade = {CascadeType.ALL})
	
	private List<Teacher> teach;
 	
	
//	@OneToOne // one to one mapping
//	 
//	@JoinColumn(name="teachId") //change the forign key 
//	private Teacher teacher; //import the teacher and create object reference
//
//	public Teacher getTeacher() {
//		return teacher;
//	}
//
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}
	
	
/*	@OneToMany
	private Collection<Teacher> teach = new ArrayList<Teacher>();
	
	public Collection<Teacher> getTeach() {
		return teach;
	}

	public void setTeach(Collection<Teacher> teach) {
		this.teach = teach;
	}*/

	public Student(String name2, String degree2, String degree3, String phone2) {
		// TODO Auto-generated constructor stub
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public List<Teacher> getTeach() {
		return teach;
	}

	public void setTeach(List<Teacher> teach) {
		this.teach = teach;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
