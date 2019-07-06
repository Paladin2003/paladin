package com.paladin.feng.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.paladin.feng.dao.BaseDao;
import com.paladin.feng.dao.IUserDao;
import com.paladin.feng.dto.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDao implements IUserDao{

	@Override
	public User  getUserInfo(Map<String,Object> loginParam) {
		return (User) selectOne("QUERY_USER_INFO_BY_ACCOUNT", loginParam);
	}

	@Override
	public void updateUserInfo(Map<String, Object> param) {
		update("UPDATE_USER_INFO", param);
	}

}
