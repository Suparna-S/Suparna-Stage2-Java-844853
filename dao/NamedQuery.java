package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.EmpPojo;
public class NamedQuery {

	public static void main(String[] args) 
	{
		 SessionFactory sessionFactory=new Configuration().configure("HibernatePrograms.cfg.xml").buildSessionFactory();
		 Session session=sessionFactory.openSession();
		 //Named Queries
		 Query query=session.getNamedQuery("CTS_EmpView");
		 System.out.println("Eid\tName\tSalary");
		 List<EmpPojo> list4=(List<EmpPojo>)query.list();
		 for(EmpPojo e:list4)
		 {
			 System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsalary());
		 }
		 Scanner s1=new Scanner(System.in);
		 //Parameterized Named Queries
		 Query query2=session.getNamedQuery("CTS_DeleteRecord");
		 System.out.println("Enter the ENO: ");
		 int deno=s1.nextInt();
		 query2.setParameter("deleid", deno);
		 int result=query2.executeUpdate();
		 System.out.println(result+ "Record Deleted");
	}

}
