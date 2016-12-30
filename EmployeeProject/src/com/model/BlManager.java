package com.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import com.commpon.FactroyaManager;
import com.view.Employee;

public class BlManager {
SessionFactory sf = FactroyaManager.getSessionFactory();
	public void insertMethod(Employee e) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
		
	}
	public List<Employee> showData() {
		// TODO Auto-generated method stub
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(Employee.class);
		List<Employee> empList= cr.list();
		tx.commit();
		s.close();
		
		return empList;
		
	}
	public Employee getId(int id) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(Employee.class);
		cr.add(Restrictions.eq("empId",id));
		//cr.add(Restrictions.idEq(id));
		Employee emp = (Employee) cr.uniqueResult();
		tx.commit();
		s.close();
		return emp;
	}
	public void updateMethod(Employee e2) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.update(e2);
		System.out.println(e2);
		tx.commit();
		s.close();
	}
	public Employee deleteMethod(Employee e) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction tx = s1.beginTransaction();
		s1.delete(e);
		tx.commit();
		s1.close();
		return e;
	}
	
	public List<Employee> getName(String name) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(Employee.class);
		//cr.add(Restrictions.eq("firstName",name));
		//cr.add(Restrictions.ilike("firstName", name));
		cr.add(Restrictions.eq("firstName", name));
		List<Employee> empList= cr.list();
		
		//Employee empa = (Employee) cr.list();
		tx.commit();
		s.close();
		return empList;
	}
	

}
