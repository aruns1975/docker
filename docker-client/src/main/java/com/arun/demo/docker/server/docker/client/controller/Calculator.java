package com.arun.demo.docker.server.docker.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client/calculator")
public class Calculator {
	@Value("${server.url}")
	private String serverUrl;
	RestTemplate restTemplate=new RestTemplate();
	
	@RequestMapping("/add")
	public Double add(@RequestParam("first")double a, @RequestParam("second") Double b){
		return restTemplate.getForObject(serverUrl+"/calculator/add?first="+a+"&second="+b, Double.class);
	}
	
	@RequestMapping("/subtract")
	public Double subtract(@RequestParam("first")double a, @RequestParam("second") Double b){
		return restTemplate.getForObject(serverUrl+"/calculator/subtract?first="+a+"&second="+b, Double.class);
	}
	
	@RequestMapping("/muliply")
	public Double multiply(@RequestParam("first")double a, @RequestParam("second") Double b){
		return restTemplate.getForObject(serverUrl+"/calculator/muliply?first="+a+"&second="+b, Double.class);
	}
	
	@RequestMapping("/divide")
	public Double divide(@RequestParam("first")double a, @RequestParam("second") Double b){
		return restTemplate.getForObject(serverUrl+"/calculator/divide?first="+a+"&second="+b, Double.class);
	}

}
