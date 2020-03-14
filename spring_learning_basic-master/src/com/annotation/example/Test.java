package com.annotation.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String args[]){
		  ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		  Employee emp = context.getBean(Employee.class);
		  System.out.println(emp.address.name);
	}
}
