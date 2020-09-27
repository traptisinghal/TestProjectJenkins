package com.example.testproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.testproject.service.HelloWorldService;


@Controller
public class HelloWorldController {

	HelloWorldService serv;
	
	@GetMapping("/hello")
	public String sayHello()
	{
	  return serv.sayHello();
	}
	
}
