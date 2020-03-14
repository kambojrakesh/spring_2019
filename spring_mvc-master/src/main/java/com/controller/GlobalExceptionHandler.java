package com.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {

	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullException(){
		return "NullPointerException";
	}
	
	@ExceptionHandler(value=IOException.class)
	public String handleIOException(){
		return "IOException";
	}
}
