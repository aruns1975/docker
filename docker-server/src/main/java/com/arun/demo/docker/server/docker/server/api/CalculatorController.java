package com.arun.demo.docker.server.docker.server.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	
	
	@RequestMapping("/add")
	public Double add(@RequestParam("first")double a, @RequestParam("second") Double b){
		return a+b;
	}
	
	@RequestMapping("/subtract")
	public Double subtract(@RequestParam("first")double a, @RequestParam("second") Double b){
		return a-b;
	}
	
	@RequestMapping("/muliply")
	public Double multiply(@RequestParam("first")double a, @RequestParam("second") Double b){
		return a*b;
	}
	
	@RequestMapping("/divide")
	public Double divide(@RequestParam("first")double a, @RequestParam("second") Double b){
		return a/b;
	}
}


