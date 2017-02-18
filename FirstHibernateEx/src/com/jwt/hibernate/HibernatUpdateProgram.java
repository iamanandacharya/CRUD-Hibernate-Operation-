package com.jwt.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernatUpdateProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration confg = new Configuration();
		confg.configure("hibernate.cfg.xml");
		SessionFactory sft = confg.buildSessionFactory();
		Session ss = sft.openSession();
		Transaction tx = ss.beginTransaction();
		//Student st =(Student)ss.get(Student.class, new Long(0));//it load the value which primary key is 1
		Student st = (Student)ss.load(Student.class,new Long(1));
		
		st.setPhone("123456789");//it update the value
		ss.update(st);//update POJO classthrogh session object
		ss.flush();//flush method is synchronize with database..
		tx.commit();
		ss.close();
	}

}
