package com.danieljeon.displaydate.controllers;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping("date")
	public String date(Model model) {
		ArrayList<String> days = new ArrayList<String>();
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		
		ArrayList<String> months = new ArrayList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		String day = new String();
		String dayNumber = new String();
		String month = new String();
		String year = new String();
		
		Date date = new Date();
		
		day = days.get(date.getDay());
		dayNumber = "" + date.getDate();
		month = months.get(date.getMonth());
		int yearInt = date.getYear() + 1900;
		year = "" + yearInt;
		
		model.addAttribute("day", day);
		model.addAttribute("dayNumber", dayNumber);
		model.addAttribute("month", month);
		model.addAttribute("year", year);
		
		return "date.jsp";
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping("time")
	public String time(Model model) {
		String hour = new String();
		String minute = new String();
		String ampm = new String();
		
		Date date = new Date();
		
		int hourInt = date.getHours();
		if (hourInt < 13) ampm = "AM";
		else {
			ampm = "PM";
			hourInt -= 12;
		}
		
		hour = ""+ hourInt;
		minute = "" + date.getMinutes();
		
		model.addAttribute("hour", hour);
		model.addAttribute("minute", minute);
		model.addAttribute("ampm", ampm);
		
		return "time.jsp";
	}
}
