package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	
	
	@GetMapping("/msg")
	public String msg()
	{
		return "msg to cjc";
	}
	
	@GetMapping("/about")
	public String about()
	{
		return "about to cjc";
	}
	
	
	@GetMapping("/contact")
	public String contact()
	{
		return "contact to cjc";
	}
	@GetMapping("/more")
	public String more()
	{
		return "more to cjc";
	}
	
	
}
