package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	//similar to @web-servlet
		@RequestMapping("/hdfclogin")

	//send data from controller to view
		
		//A model is a map object that is used to 
		//store attribute value pairs
	
public String display1()
{
	//connecting to view layer
			return "callview";//jsp view file name
}
		@RequestMapping("/signin")
		public String display2(Model m)
		{
			m.addAttribute("myname","Athifa");
			return "view12";//jsp view file name
           	
		}
}
