package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 * (i18n)Internationalization:
 * Internationalization process of designing application that can be adapted to various languages and regions.
 */
@Controller
public class InternationalizationController 
{
	@RequestMapping(value="/user_i18n", method=RequestMethod.GET)
	public ModelAndView initView()
	{
		ModelAndView modelview=new ModelAndView();
		modelview.addObject("msg","Spring MVC Internationalization Example");
		modelview.setViewName("resourcebundleview"); //jsp file name
		return modelview;
	}
}
