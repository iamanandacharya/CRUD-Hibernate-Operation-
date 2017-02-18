package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.view.Department;
import com.view.Employee;

import common.HibernateUtil;

public class BlManager {
	
	SessionFactory sf = HibernateUtil.getSessionFactory();

	public void InsertDept(Department d) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(d);
		t.commit();
		s.close();
	}

	public void insertOperation(Employee e) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction tx1 = s1.beginTransaction();
		s1.save(e);
		tx1.commit();
		s1.close();
		
	}

	public Department getDepartIdByName(String dId1) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction tx1 = s1.beginTransaction();
		Criteria cr = s1.createCriteria(Department.class);
		cr.add(Restrictions.eq("depName", dId1));
		Department dName = (Department) cr.uniqueResult();
		tx1.commit();
		s1.close();
		
		return dName;
	}

	public List<Employee> showEmp() {
		// TODO Auto-generated method stub
		 
		Session s1 = sf.openSession();
		Transaction tx = s1.beginTransaction();
	    Criteria cr = s1.createCriteria(Employee.class);
		List<Employee> empDetails = cr.list();
		tx.commit();
		s1.close();
		
		return empDetails;
		
		
	}

	public Employee updateMethod(int id_1, String empName, String empPhoneNo, String empEmail) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction tx1 = s1.beginTransaction();
		Employee e = (Employee)s1.load(Employee.class, id_1);
		e.setEmpName(empName);
		e.setEmpPhoneNo(empPhoneNo);
		e.setEmpEmail(empEmail);
		s1.update(e);
		tx1.commit();
		s1.close();
		return e;
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

	public List<Department> showDmp() {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction tx = s1.beginTransaction();
	    Criteria cr = s1.createCriteria(Department.class);
		List<Department> dmpDetails = cr.list();
		tx.commit();
		s1.close();
		
		return dmpDetails;
		
		
 		
		
		
		
	}
	
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		 
		Session s1 = sf.openSession();
		Transaction tx = s1.beginTransaction();
	    Criteria cr = s1.createCriteria(Department.class);
		List<Department> depDetails = cr.list();
		tx.commit();
		s1.close();
		System.out.println(depDetails);
		return depDetails;
		
		
	}

	public Employee empIdMethod(int eid) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction tx = s1.beginTransaction();
		Criteria cr = s1.createCriteria(Employee.class);
		//cr.add(Restrictions.idEq(eid));
		cr.add(Restrictions.eq("empId", eid));
	     Employee emp = (Employee) cr.uniqueResult();
		tx.commit();
		s1.close();
		return emp;
	}

	public void update(Employee e1) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction tx1 = s1.beginTransaction();
		s1.update(e1);
		tx1.commit();
		s1.close();
		
	}

}
