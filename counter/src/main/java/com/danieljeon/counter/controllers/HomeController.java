package com.danieljeon.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@Scope("session")
public class HomeController {

	@RequestMapping("/")
	public String home(HttpSession session, Model model) {
		if (session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
		Integer counter = (Integer) session.getAttribute("counter");
		session.setAttribute("counter", counter + 1);
		
//		model.addAttribute("counter", counter);
		
		return "home.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		if (session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
		return "counter.jsp";
	}
}
