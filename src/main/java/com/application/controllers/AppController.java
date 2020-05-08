package com.application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppController {
	
	@RequestMapping("/home")
	public String index() {
		System.out.println("Printing the home page");
		return "Greetings from Spring Boot!";
	}

}
