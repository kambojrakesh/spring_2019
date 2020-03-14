package com.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	/*@Before("execution(public String com.model.Circle.getName())")
	public void loggingAdvice(){
		System.out.println("Advice run , before com.model.Circle.getName method called.");
	}*/
	
	
	
	//getName(.) one parameter
	//getName(..) two parameter
	//getName(*) multiple parameter
	//@Before("execution(public String getName())")
	//	@Before("allGetters()")
	@Before("allGetters() && allCircle()")
	public void loggingAdviceGet(){
		System.out.println("Advice run , before get method called.");
	}
	
	@Before("allGetters()")
	public void loggingAdviceWildCard(){
		System.out.println("Advice run , before * get*() method called.");
	}

	@Pointcut("execution(* getName())")
	public void allGetters(){}
	
	
	@Pointcut("within(com.model.Circle)")
	public void allCircle(){}
}
