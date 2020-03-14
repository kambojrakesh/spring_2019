package com.controller;

//@JsonIgnoreProperties("name")
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@XmlRootElement(name = "message")
public class Message {
	String name;
	String city;
	public String getName() {
		return name;
	}
	//@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	//@XmlElement
	public void setCity(String city) {
		this.city = city;
	}
}
