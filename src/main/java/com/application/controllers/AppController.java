package com.application.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppController {
	
	@Value("${regionName}")
	public String regio;
	
	public String returnValue;
	
	@RequestMapping("/home")
	public String index() {
		System.out.println("Printing the home page");
		
		returnValue = "Greetings from Spring Boot! , Current region is :" + regio;
		
		return returnValue ;
	}
}
