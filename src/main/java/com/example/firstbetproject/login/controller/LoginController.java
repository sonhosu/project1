package com.example.firstbetproject.login.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.firstbetproject.login.service.UserService;
import com.example.firstbetproject.login.vo.UserVo;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	//회원가입 화면 
	@RequestMapping(value= "/user/join", method= RequestMethod.GET)
	public String userjoin() {
		
		return "/login/join";
	}
	
	//회원가입 처리 
	@RequestMapping(value= "/user/join", method= RequestMethod.POST)
	public String userjoinP(@ModelAttribute UserVo uservo ,@RequestParam("usertel") String[] usertel , BindingResult bindingResult ) {
		logger.info("RequestPram={}", uservo);
		if(bindingResult.hasErrors())
		System.out.println(usertel.length);
		String userphone=usertel[0].concat(usertel[1]).concat(usertel[2]);
		uservo.setUsertel(userphone);
		userService.join(uservo);
		return "main";
	}
	
	//로그인 화면 
	@RequestMapping(value= "/user/login", method= RequestMethod.GET)
	public String userlogin() {
		
		return "/login/login";
	}
	
	//로그인 처리
		@RequestMapping(value= "/user/login", method= RequestMethod.POST)
		public String userloginp() {
			
			return "/login/login";
		}
	
	
}
