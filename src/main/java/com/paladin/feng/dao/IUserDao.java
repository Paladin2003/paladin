package com.paladin.feng.dao;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.paladin.feng.dto.User;

@Component
public interface IUserDao {

	User getUserInfo(Map<String,Object> loginParam);
	
	void updateUserInfo(Map<String,Object> param);
}
