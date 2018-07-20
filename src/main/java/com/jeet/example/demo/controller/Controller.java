package com.jeet.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value = "/ex/foos")
	public String sayHi() {
		return "Hello";
	}

}
