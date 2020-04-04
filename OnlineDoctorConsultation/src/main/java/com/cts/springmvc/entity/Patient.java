package com.cts.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//pojo class can also be called as Entity class
@Entity
@Table(name = "Patients1")//mysql table
public class Patient 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	   @Column(name = "Patient_id")
	   private int P_id;
	
	   @Column(name = "Patient_name")
	   private String P_name;
	   
	   @Column(name = "Patient_pwd")
	   private String P_pwd;
	   
	   @Column(name = "Patient_mobile")
	   private int P_mobile;
	   
	   @Column(name = "Patient_age")
	   private int P_age;
	   
	   @Column(name = "Patient_city")
	   private String P_city;
	   
	   @Column(name = "Patient_state")
	   private String P_state;
	   
	   @Column(name = "Patient_diagnosed")
	   private String P_diagnosed;

	public int getP_id() {
		return P_id;
	}

	public void setP_id(int p_id) {
		P_id = p_id;
	}

	public String getP_name() {
		return P_name;
	}

	public void setP_name(String p_name) {
		P_name = p_name;
	}

	public String getP_pwd() {
		return P_pwd;
	}

	public void setP_pwd(String p_pwd) {
		P_pwd = p_pwd;
	}

	public int getP_mobile() {
		return P_mobile;
	}

	public void setP_mobile(int p_mobile) {
		P_mobile = p_mobile;
	}

	public int getP_age() {
		return P_age;
	}

	public void setP_age(int p_age) {
		P_age = p_age;
	}

	public String getP_city() {
		return P_city;
	}

	public void setP_city(String p_city) {
		P_city = p_city;
	}

	public String getP_state() {
		return P_state;
	}

	public void setP_state(String p_state) {
		P_state = p_state;
	}

	public String getP_diagnosed() {
		return P_diagnosed;
	}

	public void setP_diagnosed(String p_diagnosed) {
		P_diagnosed = p_diagnosed;
	}
	   
	   
}