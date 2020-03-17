package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Hibernate Annotation( NO XML): 
 * XML METADATA CLUBBED INTO POJO FILE
 */
//NO .HBM.XML FILE
@Entity
@Table(name="EmpAnno")
public class EmpPojo_Annotation 
{
	@Column(name="eid")
	@Id
	int Emp_no;
	
	@Column(name="ename")
	String Emp_name;
	
	@Column(name="esalary")
	float Emp_salary;

	public int getEmp_no() {
		return Emp_no;
	}

	public void setEmp_no(int emp_no) {
		Emp_no = emp_no;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public float getEmp_salary() {
		return Emp_salary;
	}

	public void setEmp_salary(float emp_salary) {
		Emp_salary = emp_salary;
	}
	

}
