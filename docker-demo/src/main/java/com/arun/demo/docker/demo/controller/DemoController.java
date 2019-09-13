package com.arun.demo.docker.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("greet")
	public String greet(){
		return "Hello, World";
	}
}
