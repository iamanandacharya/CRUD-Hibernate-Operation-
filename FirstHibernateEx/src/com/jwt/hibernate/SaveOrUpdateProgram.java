package com.jwt.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdateProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {

				
					// TODO Auto-generated method stub
					Configuration confg = new Configuration();
					confg.configure("hibernate.cfg.xml");
					SessionFactory sft = confg.buildSessionFactory();
					Session ss = sft.openSession();
					Transaction tx = ss.beginTransaction();
					//Student st =(Student)ss.get(Student.class, new Long(0));//it load the value which primary key is 1
					Student st = new Student();
					st.setId(1);
					st.setName("asd");
					st.setDegree("ads");
					st.setPhone("kkj");
					st.setRoll("456");
					ss.saveOrUpdate("Name",st);//it can be save or update the database
					ss.flush();//flush method is synchronize with database..
					tx.commit();
					ss.close();
				}
	}

}
