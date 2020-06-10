package com.danieljeon.gettingfamiliar;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DojoController {

	@RequestMapping("/{thing}")
	public String dojo(@PathVariable("thing") String thing) {
		if (thing.equals("dojo")) {
			return "The Dojo is awesome!";
		}
		else if (thing.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}
		else if (thing.equals("san-jose")) {
			return "SJ Dojo is the headquarters";
		}
		else {
			return "Invalid URL " + thing;
		}
	}
}
