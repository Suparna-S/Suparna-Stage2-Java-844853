package com.cts.springmvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.springmvc.daoImpl.PatientDAOImpl;
import com.cts.springmvc.entity.Patient;

//SERVICE IS THE MIDDLE LAYER
@Service//get from @repository and connects to @controller
@Transactional//database transaction
public class PatientServiceImpl 
{
	@Autowired
	private PatientDAOImpl patientDAO1;
	
	public void createPatient(Patient patient) 
	{
		patientDAO1.createPatient(patient);	
	}
	
	@Transactional
	public List<Patient> getpat() 
	{
		
		return patientDAO1.getPatient();
	}

	@Transactional
	public void deletepatie(long theId)
	{
		patientDAO1.deletePatie(theId);
	}

	 //call controller
    public boolean checkLogin(String userName, String userPassword){
        System.out.println("In Service class...Check Login");
        return patientDAO1.checkLogin(userName, userPassword);
 }
/*
    @Override
    public Employee getEmployee(Employee employee) {
        //
        //
        //
        return employeeDAO1.getEmployee(employee);
    }
    
    */
}
