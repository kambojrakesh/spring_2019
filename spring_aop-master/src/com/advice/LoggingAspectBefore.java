package com.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspectBefore {
	
	@Before("getAllName() && getAllCircle()")
	public void getName() {
		
	}
	
	@Pointcut("execution(* get*())")
	public void getAllName(){
		
	}
	
	@Pointcut("execution(public String com.model.Circle.getName())")
	public void getAllCircle(){
	
	}	
}
