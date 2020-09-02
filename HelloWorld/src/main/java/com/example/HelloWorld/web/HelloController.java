package com.example.HelloWorld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	@RequestMapping("/hello")
	public String hello(@RequestParam(name="location", required = false, defaultValue = "location value") String Location, @RequestParam(name="firstname", required = false, defaultValue = "name value") String Firstname) {
		return "Welcome to the " + Location + " " + Firstname + "!";
	}
}


