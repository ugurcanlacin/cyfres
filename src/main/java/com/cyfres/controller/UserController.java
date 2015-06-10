package com.cyfres.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cyfres.model.User;
import com.cyfres.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	//http://localhost:8080/cyfres/user/get/nick
	@RequestMapping("/get/{nick}")
	public ModelAndView findUserByNick(@PathVariable("nick") String nick){
		try {
			User user = userService.findByNick(nick);
			ModelAndView model = new ModelAndView("getUser");
			model.addObject("usernick", user.getNick());
			model.addObject("email", user.getEmail());
			model.addObject("name", user.getName());
			return model;
		} catch (NullPointerException e) {
			ModelAndView model = new ModelAndView("NotFoundUser");
			model.addObject("usernick", nick);
			return model;
		}		
	}
	
	//http://localhost:8080/cyfres/user/index
	@RequestMapping("/index")
	public ModelAndView welcome(){
		ModelAndView model = new ModelAndView("index");
		model.addObject("message", "Hi there!");
		return model;
	}
	
}
