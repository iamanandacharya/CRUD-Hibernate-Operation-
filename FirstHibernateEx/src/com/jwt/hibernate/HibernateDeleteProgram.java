package com.jwt.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDeleteProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration confg =new Configuration();
		confg.configure("hibernate.cfg.xml");
		SessionFactory sft = confg.buildSessionFactory();
		Session ss = sft.openSession();
		Transaction tr = ss.beginTransaction();
		Student student =(Student) ss.get(Student.class,new Long(1));//load value for delete operation
		//student.setPhone("112");
		ss.delete(student);//simply,delete method perform delete operation 
		ss.flush();
		tr.commit();
		ss.close();
		

	}

}
