package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping("/get")
	public String getSomething()
	{
		return "Hi Kartik, You are on brother....";
	}
}
