package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jjj {
	@Value("${value}")
	private String name;
	@GetMapping("/jk")
	public String display() {
		return "Welcome to this "+name;
	}
}