package com.example.ModelsAndViews.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.ModelsAndViews.model.Message;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String greeting(@RequestParam(value = "name", defaultValue = "blank") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}
	@RequestMapping("/message")
	public String messages(Model model) {
		List<Message> messages = new ArrayList<Message>();
		Message msg1 = new Message(1, "What's up?", "Greetings");
		Message msg2 = new Message(1, "Heyhey?", "Ciao");
		messages.add(msg1);
		messages.add(msg2);
		model.addAttribute("messages", messages);
		return "hello";
	}
}