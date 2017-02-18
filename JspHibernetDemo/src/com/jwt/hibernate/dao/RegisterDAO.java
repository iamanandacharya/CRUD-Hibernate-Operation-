package com.jwt.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jwt.hibernate.bean.RegisterDetailsVo;

public class RegisterDAO {
public void validate(String Name, String Password , String Address , String Email, String PhNumber)
{
	try {
		// 1. configuring hibernate
		Configuration configure = new Configuration().configure();
		
		//Create SessionFactory
		SessionFactory sessionfactory = configure.buildSessionFactory();
		
		//Get Session Object
		Session session = sessionfactory.openSession();
		
		//Starting Transaction
		Transaction trans = session.beginTransaction();
		RegisterDetailsVo reg = new RegisterDetailsVo();
		reg.setName(Name);
		reg.setPassword(Password);
		reg.setAddress(Address);
		reg.setEmail(Email);
		reg.setPhoneNumber(PhNumber);
		session.save(reg);
		trans.commit();
		System.out.println("Details Added");
	} catch (HibernateException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
		System.out.println("error");
	}
}
}
