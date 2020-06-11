package com.danieljeon.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String tryCode(@RequestParam(value="code") String code) {
		if (!code.equals("bushido")) {
			return "redirect:/createError";
		}
		else {
			return "redirect:/code";
		}
	}
	
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}
	
    @RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You must train harder!");
        return "redirect:/";
    }
}
