package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Circle;
import com.model.ShapeService;



public class AopMain {
	public static void main(String args[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  
		ShapeService ss=(ShapeService) context.getBean("shapeService",ShapeService.class);
		
		//Around
		//ss.getCircle();
		//c.setName("Changed Value");
		ss.getCircle();
		
		//after
		/*ss.getCircle().setName("Changed Value");
		System.out.println(ss.getCircle().getName());*/
		
		
		//setNameAfterReturning
		//point cut with return statement
		/*
		 * ss.getCircle().setNameAfterReturning("Rakesh");
		System.out.println(ss.getCircle().getName());
		*/
		
		
		//Joint
		/*ss.getCircle().setName("Changed Value");
		System.out.println(ss.getCircle().getName());*/	
	}
}
