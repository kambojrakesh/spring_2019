package com.model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//System.out.println("Circle setter.");
		//throw new RuntimeException("Run time exception.");
	}
	
	/*public String setNameAfterReturning(String name) {
		this.name = name;
		System.out.println("Circle setter.");
		return name+" : kamboj";
	}*/
}
