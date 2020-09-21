package com.test.housebook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.housebook.service.MemberService;
import com.test.housebook.vo.MemberVO;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService service;
	
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm(){
		
		logger.info("회원 가입 이동");
		
		return "/member/joinForm";
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm(){
		
		logger.info("로그인 이동");
		
		return "/member/loginForm";
	}

	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String memberJoin(MemberVO member) {
		
		logger.info("회원 가입 {}", member);
		
		String page = service.memberJoin(member);
		
		return page;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String memberLogin(MemberVO member) {
		
		String page = service.memberLogin(member);
		
		return page;
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String memberLogout() {
		service.memberLogout();
		
		return "redirect:/";
	}
}
