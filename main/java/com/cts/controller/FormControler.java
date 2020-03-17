package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormControler {
	@RequestMapping(value="/checkaccount",method=RequestMethod.POST)
	//@RequestParam--recieve value from jsp
	public String display
	(
			@RequestParam("user1")
			String username,
			@RequestParam("pass1")
			String pass1,
			Model m
			)
	{
		if(username.equals("Athifa"))
		{
			String msg="Hello "+username;
			//add a message to the model
			m.addAttribute("message",msg);
			return "successpage";//view jsp
		}
		else
		{
			String msg="Sorry!Invalid"+username;
			m.addAttribute("message1",msg);
			return "errorpage";//view jsp
		}
	}

}
