package com.rakuten.rakutenweb.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rakuten.rakutenweb.model.Product;

@Controller
public class LoginController {
	
	@RequestMapping("/signin")
	public String loginPage(Model model) {
	    return "login";
	}
	@RequestMapping("/signup")
	public String registerPage(Model model) {
		return "register";
	}
	
}
