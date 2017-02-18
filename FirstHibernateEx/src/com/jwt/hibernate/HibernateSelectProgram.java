package com.jwt.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSelectProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration confg =new Configuration();
		confg.configure("hibernate.cfg.xml");
		SessionFactory sfg = confg.buildSessionFactory();
		Session session = sfg.openSession();
		//show operation perform
		//load method is used for load all value which primary Id number o
		//if we are take load value and take value which is not define that it show null vlaue exception
		Student std = (Student)session.load(Student.class,new Long(1));
		/*laod and get method is get output same.only one differnece is if we 
		provide load rather than get and if record is not present so it get null pointer exception
		In Searching operation,we should use load method 
		
		*/
		//get method is used for get the data which primary key value is 0
		System.out.println(std.getId());
		System.out.println(std.getName());
		System.out.println(std.getPhone());
		System.out.println(std.getRoll());
		session.close();

	}

}
