package com.hibernate.student;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class HQLBasicProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		
		/*
		 * CRUD Operation
		 */
		//Simple Select query example
		String hql = "FROM com.hibernate.student.Student";
		String hql1 = "FROM Teacher";
		Query query = session.createQuery(hql);
		Query query1 = session.createQuery(hql1);
		List results1 = query1.list();
		List results = query.list();	
		System.out.println(results);
		System.out.println(results1);
		
		//select caluse
		Query hql3 = session.createQuery("from Teacher where teacherId = 1");
		
		List<Teacher> results2 = hql3.list();
		System.out.println(results2);
		
		//Update Query
		
			Query updateQuery = session.createQuery("update Teacher set teacherName = 'ajaks'"
							+ "where teacherId = 1");
					int result4 = updateQuery.executeUpdate();
					System.out.println(result4);
			
		
		/*//Delete Query this operation can not perform becuase it's Many to Many relation and cascade all the date
		//So Parent class can not permit of delete or update the data to child class
		
		Query deleteQuery = session.createQuery("delete Student where name='xllen'");
		int result5 = deleteQuery.executeUpdate();
		System.out.println(result5);
		*/
					

				
					
					
		/*
					 * 
					 * 		Aggregate Method In HQL
		 */
		//Count Number of Query Total Number of Query
			Query totalQuery = session.createQuery("select count(teacherId) from Teacher");
			List<Teacher> result6 = totalQuery.list();
			System.out.println(result6);
			//Sum of query
			Query sumQuery = session.createQuery("select sum(teacherId) from Teacher");
			List<Teacher> result7 = sumQuery.list();
			System.out.println(result7);
		//Average of result
			Query avgQuery = session.createQuery("select avg(teacherId) from Teacher");
			List<Teacher> resut8 = avgQuery.list();
			System.out.println(resut8);
		//Max Of Result
			Query maxResult = session.createQuery("select max(teacherId) from Teacher");
			List<Teacher> result9 = maxResult.list();
			System.out.println(result9);
		//Minimum of result
			Query minResult = session.createQuery("select min(teacherId) from Teacher");
			List<Teacher> result10 = minResult.list();
			System.out.println(result10);
			
			
			//Use pagination 
			String paginationQuery = "FROM Teacher";
			Query paginationMainQuery = session.createQuery(paginationQuery);
			query.setFirstResult(1);
			query.setMaxResults(2);
			List results11 = paginationMainQuery.list();
			System.out.println(results11);
			
		tx.commit();	
		session.close();
		
		
				
		
	}

}
