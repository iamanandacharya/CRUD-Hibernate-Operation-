package com.model;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.common.Hibernateutil;

import com.view.Dept;
import com.view.Emp;

public class BlManager {
	
	SessionFactory sf = Hibernateutil.getSessionFactory();

	public Dept searchbyDept(String drop) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Criteria cr=s.createCriteria(Dept.class);
		cr.add(Restrictions.eq("deptName",drop));
		Dept did=(Dept) cr.uniqueResult();
		t.commit();
		s.close();
		
		return did;
	}

	public void insertEmp(Emp e) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(e);
		t.commit();
		s.close();
	}

	@SuppressWarnings("unchecked")
	public List<Emp> SearchAllEmployee() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Criteria cr=s.createCriteria(Emp.class);
		List<Emp> em=cr.list();
		
		t.commit();
		s.close();
		return em;
	}

	public Emp SearchByEmp(int id) {
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		
		Criteria cr = s.createCriteria(Emp.class);
		
		
		cr.add(Restrictions.eq("empId", id));
		

		Emp e = (Emp) cr.uniqueResult();

		return e;
	}

	public void DeleteEmp(Emp emp) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.delete(emp);
		t.commit();
		s.close();		
	}

	public Emp SearchByEmpIDSingle(int id) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Criteria cr=s.createCriteria(Emp.class);
		cr.add(Restrictions.eq("empId",id));
		
		Emp e=(Emp) cr.uniqueResult();
		
		t.commit();
		s.close();
		return e;

	}

	public void UpdateEmployee(Emp empl) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.update(empl);
		t.commit();
		s.close();
	}

}
