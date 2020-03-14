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
public class ExceptionController {
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@RequestMapping(value="/exception", method=RequestMethod.GET)
	public ModelAndView handleGreetingByMapNullPointerHandler(@Valid @ModelAttribute Student student, BindingResult bindingResult) throws Exception{
		
		String exceptionOccured="Null_Pointer1";
		
		if(exceptionOccured.equals("Null_Pointer")){
			throw new NullPointerException("Null");
		} else if(exceptionOccured.equals("IOException")){
			throw new IOException();
		} else{
			throw new Exception("Exception");
		}
	}
}
