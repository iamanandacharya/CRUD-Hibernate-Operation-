package Program;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sft = cfg.buildSessionFactory();
		Session session = sft.openSession();
		Transaction tt = session.beginTransaction();
		PresistentClass ps = new PresistentClass();
		ps.setName("asd");
		ps.setRoll("105");
		ps.setPhone("888548");
		ps.setDegree("B");
		session.saveOrUpdate("Name",ps);
		System.out.println("Object saved successfully.....!!");
		tt.commit();
		session.close();
		sft.close();
	}

}
