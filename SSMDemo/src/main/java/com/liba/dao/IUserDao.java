package com.liba.dao;

import org.springframework.stereotype.Component;

import com.liba.entity.User;

@Component
public interface IUserDao {
	public User doLogin(String name);
}
