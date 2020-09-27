package com.example.testproject.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testproject.service.HelloWorldService;


@RestController
public class HelloWorldController {

	@Autowired
	HelloWorldService serv;
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return serv.sayHello();
	}
	
}
