package com.controller;

import java.io.IOException;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMsg", "Common header message.");
	}
	
	@RequestMapping(value="/AdmissionForm.html", method=RequestMethod.GET)
	public ModelAndView handleGreeting(){
		ModelAndView model=new ModelAndView("/AdmissionForm");
		return model;
	}
	
	/*@RequestMapping(value="/AdmissionForm1.html", method=RequestMethod.POST)
	public ModelAndView handleGreetingByMap(@RequestParam Map<String,String> map){
		
		ModelAndView model=new ModelAndView("/AdmissionSuccess");
		
		String username=map.get("username");
		String age=map.get("age");
		
		model.addObject("msg",username);
		model.addObject("age",age);
		return model;
	}
	
	@RequestMapping(value="/AdmissionForm2.html", method=RequestMethod.POST)
	public ModelAndView handleGreetingByMapWithModel2(@RequestParam Map<String,String> map){


		
		ModelAndView model=new ModelAndView("/AdmissionSuccess");
		Student student=new Student();
		student.setUsername(map.get("username"));
		student.setAge(map.get("age"));
		
		model.addObject("student",student);

		return model;
	}
	*/
	
	
	@RequestMapping(value="/AdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView handleGreetingByMapWithModel(@Valid @ModelAttribute Student student, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			ModelAndView model1=new ModelAndView("/AdmissionForm");
			return model1;
		}
		
		ModelAndView model=new ModelAndView("/AdmissionSuccess");
		return model;
	}
	
	
}
