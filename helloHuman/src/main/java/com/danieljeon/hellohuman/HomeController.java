package com.danieljeon.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String hello(@RequestParam(value="name", required=false) String name, @RequestParam(value="last_name", required=false) String last_name) {
		String output = new String();
		if (name == null && last_name == null) output = "Human";
		else if (name == null) output = last_name;
		else if (last_name == null) output = name;
		else output = name + " " + last_name;
		return "Hello " + output;
	}
	
}
