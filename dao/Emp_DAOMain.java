package com.dao;
import java.util.Scanner;



import java.util.Scanner;



import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.pojo.EmpPojo;

public class Emp_DAOMain 


{

public static void main(String[] args) {

 // TODO Auto-generated method stub

 SessionFactory sessionFactory=new Configuration().configure("HibernatePrograms.cfg.xml").buildSessionFactory();

 Session session=sessionFactory.openSession();

 //start a transaction

 Transaction tx=session.beginTransaction();

 EmpPojo e1=new EmpPojo(); //pojo object

 Scanner scan=new Scanner(System.in);

 System.out.println("Eno: ");

 int eno1=scan.nextInt();

 System.out.println("Name: ");

 String name1=scan.next();

 System.out.println("Salary: ");

 float salary1=scan.nextFloat();

 scan.close();



 e1.setEid(eno1);

 e1.setEname(name1);

 e1.setEsalary(salary1);





 //upto Emp_Pojo is transient state

 //persist==insert into tablename values

 session.persist(e1);//persistent state or saving POJO object

 System.out.println("*****Inserted*****");

 //without commit not reflected in database

 tx.commit();//commit or save the query



 }

}
