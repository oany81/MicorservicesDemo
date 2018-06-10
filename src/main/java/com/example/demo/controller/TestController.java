package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
	@RequestMapping("/test")
	public String test()
	{
		return "HELLO OAN'S WORLD";
	}

	
	@RequestMapping("/test1")
	public String test1()
	{
		return "HELLO WORLD";
	}
	
}
