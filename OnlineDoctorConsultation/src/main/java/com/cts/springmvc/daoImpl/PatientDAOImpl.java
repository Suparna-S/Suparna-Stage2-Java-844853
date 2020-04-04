package com.cts.springmvc.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.springmvc.entity.Patient;

@Repository//marker for persistence layer
public class PatientDAOImpl 
{
	@Autowired
	SessionFactory sessionFactory;//dispatcher-servlet.xm

	public void createPatient(Patient patient) {
		Session session = sessionFactory.openSession();
		session.save(patient);//persist hibernate
		System.out.println("Record Inserted");
		session.close();
	}
	public List<Patient> getPatient() 
	{
		//get the hibernate session
		Session session = sessionFactory.openSession();
		//create a query.. sort by lastName
	//sorting the record by name 	
		Query theQuery = session.createQuery("from Patient order by name");
		List<Patient> e1 = theQuery.list();
		return e1;
	}
	public void deletePatie(long theId)
	{
		Session session = sessionFactory.openSession();
		//:abc runtime variable
		Query theQuery = session.createQuery("delete from Patient where id=:abc");
		theQuery.setParameter("abc", theId);
		theQuery.executeUpdate();
	}
		  public boolean checkLogin(String userName, String userPassword){
			System.out.println("In Check login");
			Session session = sessionFactory.openSession();
			boolean userFound = false;
			//Query using Hibernate Query Language
			String SQL_QUERY =" from Patient as o where o.username=? and o.password=?";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter(0,userName);//first ?
			query.setParameter(1,userPassword);//second ?
			List list = query.list();

			if ((list != null) && (list.size() > 0)) {
				userFound= true;
			}

			session.close();
			return userFound;              
   }
 	
	
	


}
