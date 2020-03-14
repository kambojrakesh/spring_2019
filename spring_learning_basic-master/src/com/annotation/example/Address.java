package com.annotation.example;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	String name;
	
	public String getName() {
		return name;
	}
	
	@Required
	//@Value("rikki")
	public void setName(String name) {
		this.name = name;
	}

}
