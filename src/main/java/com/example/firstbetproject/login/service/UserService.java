package com.example.firstbetproject.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstbetproject.login.dao.UserDao;
import com.example.firstbetproject.login.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void join(UserVo uservo) {
		System.out.println("uservo::"+uservo);
		userDao.join(uservo);
	}



}
