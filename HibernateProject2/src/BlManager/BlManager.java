package BlManager;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.common.HibernateUtil;
import com.view.Employee;

public class BlManager {
	SessionFactory sf = HibernateUtil.getSessionFactory();

	
	public void insetMethod(Employee e) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction tx  =  s.beginTransaction();
		s.save(e);
		s.close();
		tx.commit();
		
	}


	public List<Employee> showMethod() {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(Employee.class);
		List<Employee> list = cr.list();
		s.close();
		tx.commit();
		return list;
	}

}
