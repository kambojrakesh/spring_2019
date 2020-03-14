package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/welcome")
public class HelloController {
	
	@RequestMapping("/check")
	public ModelAndView handleRequest(){
		ModelAndView model=new ModelAndView("Hello");
		model.addObject("msg","First program in spring mvc.");
		return model;
	}	
	
	@RequestMapping("/greeting/{username}")
	public ModelAndView handleGreeting(@PathVariable String username){
		ModelAndView model=new ModelAndView("Hello");
		model.addObject("msg",username);
		return model;
	}
	
	//Alternative of above method
	@RequestMapping("/greeting/{username}/{age}")
	public ModelAndView handleGreetingByMap(@PathVariable Map<String,String> map){
		String username=map.get("username");
		String age=map.get("age");
		ModelAndView model=new ModelAndView("Hello");
		model.addObject("msg",username);
		model.addObject("age",age);
		return model;
	}
	
	
	
}
