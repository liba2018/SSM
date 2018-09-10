package com.liba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liba.service.IUserService;

@Controller
public class UserController {
	
	@Autowired
	IUserService userService;
	@RequestMapping("/doLogin")
	private String login(){
		System.out.println("------------登录操作-------------");
		String name="liba";
		String password="";
		userService.doLogin(name, password);
		return "doLogin";
	}
}
