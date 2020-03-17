package com.dao;

import java.util.HashSet;
import java.util.Set;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.CustomerPojo;
import com.pojo.VendorPojo;
public class OneToManyRelation {

	public static void main(String[] args) 
	{
		Session s=new Configuration().configure("HibernatePrograms.cfg.xml").buildSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		VendorPojo v=new VendorPojo();
		v.setVid1(10);
		v.setVname1("BTS");
		v.setEmail("admin@bts.com");
		
		CustomerPojo c1=new CustomerPojo();
		c1.setCustid(24);
		c1.setCustname("Suparna");
		
		CustomerPojo c2=new CustomerPojo();
		c2.setCustid(66);
		c2.setCustname("SuparnaS");
		
		Set s11=new HashSet();
		s11.add(c1);
		s11.add(c2);
		v.setCust1(s11);  //one VENDOR to many CUSTOMERS
		s.save(v); //==s.persist()
		t.commit();
		s.close();   //detached
		System.out.println("One to Many Done!!!");
		
	}

}
