package com.advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.model.Circle;

@Aspect
public class LoggingAspectJoint {
	
	@Before("getAllCircle()")
	public void loggingAdvice(JoinPoint jp) {
		//System.out.println(jp.getTarget());
		//Circle cr=(Circle) jp.getTarget();
		//System.out.println(cr.getName());
		//System.out.println("Advice run , before get method called.");
	}
	
	@Before("args(name)")
	public void stringArgumentsMethods(String name){
		System.out.println("String Arguments Methods :: " + name);
	}
	
	@Pointcut("within(com.model.Circle)")
	public void getAllCircle(){ }	
}
