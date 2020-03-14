package com.lifecycles.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String args[]){
		  ApplicationContext context = new AnnotationConfigApplicationContext(Employee.class);
		  Employee emp=context.getBean(Employee.class);
		  System.out.println(emp.name);
	}
}
