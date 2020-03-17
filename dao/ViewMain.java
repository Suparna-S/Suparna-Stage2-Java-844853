package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.EmpPojo;

public class ViewMain {

	public static void main(String[] args) {
	SessionFactory sessionFactory=new Configuration().configure("HibernatePrograms.cfg.xml").buildSessionFactory();
		 Session session=sessionFactory.openSession();
		 /*
		  * HQL-Hibernate query language

		  * HQL uses class name instead of table name,

		  * and property names instead of column name.

		  */
		 //String query1="select * from EMP_Pojo";//error

		 //String query1="select Empno1,Empname1,salary1 from Emp_Pojo";//valid

		 //no table name only pojo class name

		 String query1="From EmpPojo";//valid

		 Query query4=session.createQuery(query1);

		 List<EmpPojo> list4=(List<EmpPojo>)query4.list();//resultset

		 for(EmpPojo e:list4)

		 {

		  System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsalary());

		 }

		 String SQL_QUERY="select max(e1.esalary)from EmpPojo e1";

		 query4=session.createQuery(SQL_QUERY);

		 List l1=query4.list();

		 System.out.println("MAX Salary: " +l1.get(0));

		 Query query5=session.createQuery("from EmpPojo where ename='Suparna'");

		 List list3=query5.list();

		 EmpPojo obj1=(EmpPojo)list3.get(0);

		 System.out.println("Suparna Salary: "+ obj1.getEsalary());
		 
		 //Parameterized Queries
		 //Positional parameter
		 //String q="from EmpPojo_Annotation where Emp_num=?";
		 String q="from EmpPojo where eid=:abc";
		 
		 query4=session.createQuery(q);
		 System.out.println("Enter EID: ");
		 Scanner sc1=new Scanner(System.in);
		 int eid11=sc1.nextInt();
		 query4.setInteger("abc", eid11);
		 List l2=query4.list();
		 EmpPojo obj12=(EmpPojo)l2.get(0);
		 System.out.println("Name and Salary: "+obj12.getEname()+" "+obj12.getEsalary());
		 session.close(); //detached state

	}

}
