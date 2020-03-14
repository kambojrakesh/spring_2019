package com.advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.model.Circle;

@Aspect
public class LoggingAspectAfter {
	
	@Before("getAllCircle()")
	public void loggingAdvice(JoinPoint jp) {	}
	
	/*@AfterReturning("args(name)")
	public void stringArgumentsMethods(String name){
		System.out.println("@AfterReturning String Arguments Methods :: " + name);
	}*/
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringPointCutArgumentsMethods(String name, String returnString){
		System.out.println("@AfterReturning with point cut and return value :: " + name + " ; returnString :: " + returnString);
	}
	
	/*@After("args(name)")
	public void stringArgumentsMethods(String name){
		System.out.println("@After String Arguments Methods :: " + name);
	}*/
	
	@AfterThrowing("args(name)")
	public void stringArgumentsMethods(String name){
		System.out.println("@AfterThrowing String Arguments Methods :: " + name);
	}
	
	@Pointcut("within(com.model.Circle)")
	public void getAllCircle(){ }	
}
