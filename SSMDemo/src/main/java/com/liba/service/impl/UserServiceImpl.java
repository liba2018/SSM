package com.liba.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liba.dao.UserMapper;
import com.liba.entity.User;
import com.liba.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	UserMapper userMapper;
	public boolean doLogin(String name, String password) {
		
		//iUserDao.doLogin(name);
		User user = userMapper.selectByUserName(name);
		boolean equals = user.getUsername().equals(password);
		if(equals){
			return true;
		}
		return false;
	}

}
