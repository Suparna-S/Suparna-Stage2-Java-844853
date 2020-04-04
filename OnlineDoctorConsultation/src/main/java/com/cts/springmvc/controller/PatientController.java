package com.cts.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.springmvc.entity.Patient;
import com.cts.springmvc.serviceImpl.PatientServiceImpl;

@Controller
public class PatientController 
{
	@Autowired
	private PatientServiceImpl patientService1;
	@RequestMapping("/home")
	public String createUser1(Model m) 
	{	
		//employee attribute==modelattribute in register.jsp
		m.addAttribute("patient",new Patient());
		return "HomePage";//register.jsp==form action=register
		
	}
	@RequestMapping("/Admin_Page")
	public String adminlogin(Model m)
	{
		m.addAttribute("patient",new Patient());
		return "AdminPage"; 
	}
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(@ModelAttribute Patient patient1,Model m)
	{
		List<Patient> obj=patientService1.getpat();
		m.addAttribute("pat",obj);//emps can beaccessin ViewEmp.jsp
			return "ViewPat";//ViewEmp.jsp
	}
	//deletion
    @RequestMapping(value="/deletepatie/{delno}",method = RequestMethod.GET)    
    public String delpat(
    		@PathVariable 
    		int delno)
    {    
    	patientService1.deletepatie(delno);
        return "redirect:/view"; //call req pattern /view
    } 
	@RequestMapping("/PatientRegistration")
	public String patientreg(Model m)
		{
			m.addAttribute("patient",new Patient());
			return "redirect:/PatientRegistration";
		}
	@RequestMapping("/PatientLogin")
	public String patientlogin(Model m)
		{
			m.addAttribute("patient",new Patient());
			return "PatientLogin";
		}
	@RequestMapping(value = "PatientLogin", method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute Patient patient) 
	{
		boolean pat1 = patientService1.checkLogin(patient.getP_name(),patient.getP_pwd());
		ModelAndView model = null;
		if (patient.getP_name().equals("AdminPage")&&patient.getP_pwd().equals("123456")) 
		{
			model = new ModelAndView("ViewPat");//loginsuccess.jsp
			model.addObject("pat1", patient.getP_name());//access in jsp
			
		} else {
			model = new ModelAndView("AdminPage");//login.jsp
			model.addObject("result", "Invalid Username or Password!!");
		}
		return model;
	}
}
