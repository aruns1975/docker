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
		String url = serverUrl+"/calculator/add?first="+a+"&second="+b;
		System.out.println("The url called -> "+url);
		return restTemplate.getForObject(url, Double.class);
	}
	
	@RequestMapping("/subtract")
	public Double subtract(@RequestParam("first")double a, @RequestParam("second") Double b){
		String url = serverUrl+"/calculator/subtract?first="+a+"&second="+b;
		System.out.println("The url called -> "+url);
		return restTemplate.getForObject(url, Double.class);
	}
	
	@RequestMapping("/multiply")
	public Double multiply(@RequestParam("first")double a, @RequestParam("second") Double b){
		String url = serverUrl+"/calculator/muliply?first="+a+"&second="+b;
		System.out.println("The url called -> "+url);
		return restTemplate.getForObject(url, Double.class);
	}
	
	@RequestMapping("/divide")
	public Double divide(@RequestParam("first")double a, @RequestParam("second") Double b){
		String url = serverUrl+"/calculator/divide?first="+a+"&second="+b;
		System.out.println("The url called -> "+url);
		return restTemplate.getForObject(url, Double.class);
	}

}
