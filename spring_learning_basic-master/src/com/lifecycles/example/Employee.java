package com.lifecycles.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

//public class Employee implements InitializingBean,DisposableBean{
public class Employee {
	@Value("Rakesh")
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*@Override
	public void destroy() throws Exception {
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		//if(null == name)
			setName("Rikki");
	}*/

	@PostConstruct
	public void init(){
		setName("Vikki");
	}
	
	@PreDestroy
	public void destroy(){

	}
}
