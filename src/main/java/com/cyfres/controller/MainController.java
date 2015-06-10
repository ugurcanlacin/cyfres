package com.cyfres.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView home(HttpServletRequest request) {
		boolean isLoggedIn = request.getSession().getAttribute("isLoggedIn") != null;
		if (isLoggedIn) {
			request.getSession().removeAttribute("isLoggedIn");
			ModelAndView model = new ModelAndView("index");
			model.addObject("message", isLoggedIn);
			return model;
		} else {
			ModelAndView model = new ModelAndView("login");
			model.addObject("message", isLoggedIn);
			return model;
		}
		
	}
}
