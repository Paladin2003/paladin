package com.paladin.feng.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paladin.feng.dao.IUserDao;
import com.paladin.feng.dto.User;

@Controller("loginController")
public class LoginController {

	@Resource
	private IUserDao userDao;

	@RequestMapping(value="login.do",method=RequestMethod.POST)
	public String login(HttpServletRequest request,HttpServletResponse response) {
		Map<String,Object> loginParam = new HashMap<String,Object>();
		String account = request.getParameter("account");
		loginParam.put("account", account);
		System.out.println("account=====" +account);
		User user = userDao.getUserInfo(loginParam);
		System.out.println("user=====" +user);
		request.setAttribute("user", user);
		return "userInfo";
	}
	
	@ResponseBody
	@RequestMapping(value="updateUser.do" ,method=RequestMethod.POST)
	@Transactional(propagation=Propagation.REQUIRES_NEW,timeout=30,rollbackFor= {Exception.class,RuntimeException.class})
	public void updateUserInfo(HttpServletRequest request, HttpServletResponse response){
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("account", request.getParameter("account"));
		param.put("name", request.getParameter("name"));
		param.put("mail", request.getParameter("mail"));
		param.put("phone", request.getParameter("phone"));
		System.out.println("updateparam:" + param);
		userDao.updateUserInfo(param);
	}
	
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
}
