package com.liba.service;

import org.springframework.stereotype.Service;


public interface IUserService {
	
	public boolean doLogin(String name,String password);
}
