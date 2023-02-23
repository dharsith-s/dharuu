package com.example.demo.changecolor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class changecolor {
@GetMapping("/")
public String color() {
	 String color="RED";
	return "MY favourite "+color;
}
}
