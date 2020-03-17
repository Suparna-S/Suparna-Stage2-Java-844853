package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cts_customers")
public class CustomerPojo 
{
	@Id
	@Column(name="custid",nullable=false)
	int custid;
	@Column(name="custname", nullable=false,length=25)
	String custname;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
}
