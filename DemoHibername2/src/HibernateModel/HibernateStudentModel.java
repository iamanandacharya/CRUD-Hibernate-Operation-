package HibernateModel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateStudentModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.addResource("hibernate.cfg.xml");
		SessionFactory sfg = cfg.buildSessionFactory();
		Session session = sfg.openSession();
		StudentBean stb =new StudentBean();
		stb.setId(1);
		stb.setUserName("Anand");
		stb.setPassword("anand");
		stb.setRePass("anand");
		stb.setPhoneNumber(123456);
		stb.setEmail("anan@hmai.com");
		stb.setAddress("Godhra");
		Transaction tx = session.beginTransaction();
		session.save(stb);
		System.out.println("success");
		tx.commit();
		session.close();
		sfg.close();
		

	}

}
