package com.example.firstbetproject.login.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.firstbetproject.login.vo.UserVo;

@Repository
public class UserDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private static final String nameSpace ="com.example.firstbetproject.login.dao.UserDao";
	//회원가입
	public void join (UserVo uservo) {
		this.sqlSessionTemplate.insert(nameSpace+".insert", uservo);
	}
}
