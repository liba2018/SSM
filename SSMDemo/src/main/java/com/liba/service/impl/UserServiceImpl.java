package com.liba.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liba.dao.IUserDao;
import com.liba.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserDao iUserDao;
	public boolean doLogin(String name, String password) {
		
		//iUserDao.doLogin(name);
		return true;
	}

}
