package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class Demo {

	@RequestMapping("/login")
	public String login(){
		return "spring boot";
	}
	
}
