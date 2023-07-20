package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author-Dattatray Bharde
 */

@RestController
@RequestMapping("/")
public class Controller {
	
	@GetMapping
	public String get() {
		return "This is Swagger Demo";
	}
	@PostMapping("save")
	public String post() {
		return "hello world";
	}
	
	@PostMapping("savedata")
	public String postdata() {
		return "hello java";
	}


}
