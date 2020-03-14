package com.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class WebController2 {
	
	
	@RequestMapping(value="/rest2", method=RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	public ArrayList<Message> handleGreetingByMapWithModel(){
		
		Message msg=new Message();
		msg.setCity("FB");
		msg.setName("Rakesh");
		
		Message msg1=new Message();
		msg1.setCity("Delhi");
		msg1.setName("Aj");
		
		Message msg2=new Message();
		msg2.setCity("Delhi");
		
		ArrayList al=new ArrayList();
		al.add(msg);
		al.add(msg1);
		al.add(msg2);
		
		return al;
	}
	
	
}
