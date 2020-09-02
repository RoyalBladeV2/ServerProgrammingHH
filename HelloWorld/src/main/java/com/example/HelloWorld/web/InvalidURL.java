package com.example.HelloWorld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class InvalidURL {
	@RequestMapping({"/*", " * ", ""})
	public String invalid() {
		return "The URL you entered isn't valid! Try another one!";
	}
}
