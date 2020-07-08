package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String getHello() {
		return "God is good";
	}

	@GetMapping("/hello1")
	public String getHello1() {
		return "Goddess is good";
	}
	
}
