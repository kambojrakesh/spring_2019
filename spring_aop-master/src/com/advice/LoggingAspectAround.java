package com.advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspectAround {
	
	@Before("getAllCircle()")
	public void loggingAdvice(JoinPoint jp) {	}
	
	@Around("allGetters()")
	public void myAroundAdvice(ProceedingJoinPoint pjp){
		try{
			
			System.out.println("Before..");
			
			pjp.proceed();
			
			System.out.println("After..");
			
		}  catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Finally..");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){ }
	
	@Pointcut("within(com.model.Circle)")
	public void getAllCircle(){ }	
}
