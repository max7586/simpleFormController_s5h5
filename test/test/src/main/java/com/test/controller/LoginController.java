package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.entity.User;
import com.test.service.LoginService;

@Controller
@RequestMapping("/test")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	public String login(Model theModel) {		
		return "/login";
	}
	
	@GetMapping("/@GetMapping("/login")")
	public String loginSubmit(@ModelAttribute("user") User user) {
		loginService.findUser(user.getId);
		return "redirect:/welcome";
	}
		
}