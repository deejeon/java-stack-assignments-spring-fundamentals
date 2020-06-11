package com.danieljeon.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public String processSurvey(@RequestParam(value="name") String name,
								@RequestParam(value="location") String location,
								@RequestParam(value="language") String language,
								@RequestParam(value="comment") String comment,
								HttpSession session) {
		if (language.equals("Java")) {
			return "redirect:/java";
		}
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "java.jsp";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "result.jsp";
	}
}
