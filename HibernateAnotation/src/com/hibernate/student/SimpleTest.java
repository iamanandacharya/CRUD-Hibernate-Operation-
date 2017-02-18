package com.hibernate.student;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class SimpleTest {

	public static void main(String[] args) {

		Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Student student = new Student();
		student.setName("xllen");
		student.setDegree("A");
		student.setPhone("123456");
		student.setRoll("A1235");
		
		Student student1 = new Student();
		student1.setName("Aklen");
		student1.setDegree("B");
		student1.setPhone("5456213");
		student1.setRoll("A1236");
		
		List<Student> st = new ArrayList<Student>();
		st.add(student);
		st.add(student1);
		
		Teacher teach = new Teacher();
		teach.setTeacherName("shy");
		teach.setTeachCode("A13");
		
		Teacher teach1 = new Teacher();
		teach1.setTeacherName("john");
		teach.setTeachCode("A12");
		
		List<Teacher> teachMain = new ArrayList<Teacher>();
		teachMain.add(teach);
		teachMain.add(teach1);
		/*One to One relation
		 student.setTeacher(teach);
		student.setTeacher(teach1);
		 */
	
		/* one to many & Many to one relation
		student.getTeach().add(teach);
		student.getTeach().add(teach1);
		teach.setStudent(student);
		teach1.setStd(student);
		*/
		
		teach.setStudent(st);
		teach1.setStudent(st);
		student.setTeach(teachMain);
		student1.setTeach(teachMain);
		
//		session.save(teach);
//		session.save(teach1);
		session.save(student);
		session.save(student1);
		System.out.println("Object saved successfully.....!!");
		session.flush();
	//	tx.commit();
		session.getTransaction().commit();
		session.close();
		
	}
}