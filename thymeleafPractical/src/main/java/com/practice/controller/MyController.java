package com.practice.controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
@Controller
public class MyController {
	
	@GetMapping("/about")
	public String about(Model model)
	{
		System.out.println("Inside about handler");
		model.addAttribute("name","NRIFT");
		model.addAttribute("Date", new Date());
		return "about";
	}
}
