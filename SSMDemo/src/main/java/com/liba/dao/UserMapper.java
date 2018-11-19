package com.liba.dao;

import org.springframework.stereotype.Component;

import com.liba.entity.User;
@Component
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    User selectByUserName(String name);
}