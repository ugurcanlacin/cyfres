package com.cyfres.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("login");
		model.addObject("message", "Hi there!");
		return model;
	}
}
