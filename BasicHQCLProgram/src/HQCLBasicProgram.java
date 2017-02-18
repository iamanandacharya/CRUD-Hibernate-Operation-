

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class HQCLBasicProgram {
	private static SessionFactory factory;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			factory = new AnnotationConfiguration().configure().buildSessionFactory();
			} catch (Throwable  e) {
				// TODO: handle exception
				 System.err.println("Failed to create sessionFactory object." + e);
		         throw new ExceptionInInitializerError(e);
			}
		HQCLBasicProgram sqcm = new HQCLBasicProgram();
		Integer empD1 = sqcm.empADD("ABC", "abc", 2000);
		Integer empD2 = sqcm.empADD("DEF", "def", 3000);
		Integer empD3 = sqcm.empADD("GHI", "ghi", 30000);
		Integer empD4 = sqcm.empADD("XYZ", "xyz", 5000);
		
		sqcm.empList();
		sqcm.totalCount();
		sqcm.totalSalary();
		
	}
	//Create Student table in database
	public Integer empADD(String fname, String lname,Integer salary )
	
	{
	Session session = factory.openSession();
	Transaction tx = null;
	Integer id = null;
	try {
		tx = session.beginTransaction();
		Employee std = new Employee(fname, lname, salary);
		id = (Integer) session.save(std);
		tx.commit();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return id;
	}
	//Method to read all object havin dalary more than 2000
	public void empList()
	{
		Session session = factory.openSession();
		Transaction tx = null;
		Integer id = null;
		try{
			tx = session.beginTransaction();
			Criteria cr = session.createCriteria(Employee.class);
		//Add Restriction
			cr.add(Restrictions.between("salary", 1000, 3000));
			List employee = cr.list();
			for(Iterator it = employee.iterator(); it.hasNext();){
				Employee empl= (Employee) it.next();
				System.out.println("First Name : " + empl.getFirstName());
				System.out.println("Last Name" + empl.getLastName());
				System.out.println("Salary" + empl.getSalary());
			}
			tx.commit();
		}catch(HibernateException  e)
		{
			if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
		}
		session.close(); 
	}
	public void totalCount()
	{
		Session session = factory.openSession();
		Transaction tx = null;
		Integer id = null;
		try {
			tx = session.beginTransaction();
			Criteria cr = session.createCriteria(Employee.class);
			//To get Total Row count
			cr.setProjection(Projections.rowCount());
			List list = cr.list();
			System.out.println("Total Count: " + list.get(0));
			tx.commit();
		} catch (HibernateException  e) {
			 if (tx!=null) tx.rollback();
	         e.printStackTrace();
			// TODO: handle exception
		}
		session.close(); 
	}
	public void totalSalary()
	{
		Session session = factory.openSession();
		Transaction tx = null;
		Integer id = null;
		try {
			tx = session.beginTransaction();
			Criteria cr = session.createCriteria(Employee.class);
			cr.setProjection(Projections.sum("salary"));
			List list = cr.list();
			System.out.println("Tota salary " + list.get(0));
			tx.commit();
			
		} catch (HibernateException e) {
			// TODO: handle exception
			 if (tx!=null) tx.rollback();
	         e.printStackTrace();
		}
		session.close();
	}
	
	
	

}
