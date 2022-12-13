package com.springbootcurdapi.springsecurity.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	
	@GetMapping("/home")
	public String home()
	{
		return "you are in the home page"; 
	}
	
	@GetMapping("/dashboard")
	public String dashboard()
	{
		return "This is dashboard content";
	}

}
