package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.pojo.EmpPojo;

public class CriteriaQueries {

	public static void main(String[] args) {
		Session s=new Configuration().configure("HibernatePrograms.cfg.xml").buildSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		Criteria cr=s.createCriteria(EmpPojo.class);
		//Add restriction
		//cr.add(Restrictions.get("salary",50000.00f));
		cr.add(Restrictions.between("esalary", 25000.00f, 48000.00f));
		List employees=cr.list();
		List<EmpPojo> list4=(List<EmpPojo>)cr.list();
		for(EmpPojo e:list4)
		{
			System.out.println("First Criteria: "+e.getEid()+" "+e.getEname()+" "+e.getEsalary());
		}
		//projectionS-average, maximum, or minimum
		//to get total salry
		Criteria cr11=s.createCriteria(EmpPojo.class);
		
		cr11.setProjection(Projections.sum("esalary"));
		List totalSalary=cr11.list();
		System.out.println("Total Salary: "+totalSalary.get(0));
	}

}
