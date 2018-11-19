package com.liba.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liba.service.IUserService;

@Controller
public class UserController {
	
	/*@Autowired
	IUserService userService;*/
	@RequestMapping("/doLogin")
	public @ResponseBody String login(@RequestParam Map<String,Object> map){
		System.out.println("------------登录操作-------------");
		String name=(String) map.get("username");
		String password=(String) map.get("password");
		/*boolean doLogin = userService.doLogin(name, password);
		
		if(doLogin){
			map.put("flag", true);
		}else{
			map.put("flag", false);
		}
		//return "doLogin";*/
		return map.toString();
	}
}
