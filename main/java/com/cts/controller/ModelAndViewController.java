package com.cts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAndViewController 
{
	@RequestMapping(value="/modview",method=RequestMethod.GET)
	public ModelAndView getdata()
	{
		List<String> list=getList();
		//return back to modelview.jsp
		ModelAndView m1=new ModelAndView("modelview"); //return view jsp
		m1.addObject("lists", list);
		return m1; //return model object
	}
	private List<String> getList()
	{
		List<String> list=new ArrayList<String>();
		list.add("JAVA");
		list.add("PYTHON");
		list.add("ANGULAR");
		list.add("EXPRESS FRAMEWORK");
		list.add("SWAGGER TOOL");
		return list;
	}
}
