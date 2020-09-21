package com.scit.web10.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.web10.service.MemberService;
import com.scit.web10.vo.MemberVO;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/member")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	public MemberService service;
	
	@RequestMapping(value = "/joinForm")
	public String joinForm() {
		
		logger.info("회원 가입 페이지 이동");
		
		return "member/joinForm";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(MemberVO member) {
		
		logger.info("회원 가입{}", member);
		
		String page = service.memberJoin(member);
		
		return page;
	}
	
	@RequestMapping(value = "/joinFail", method = RequestMethod.GET)
	public String joinFail() {
		
		return "member/joinFail";
	}
	
	@RequestMapping(value = "/memberList", method = RequestMethod.GET)
	public String memberList(Model model) {
		
		logger.info("회원 목록 페이지 이동");
		
		ArrayList<MemberVO> list = service.memberList();
		
		model.addAttribute("memberList", list);
		
		return "member/memberList";
	}
	
	@RequestMapping(value = "/memberDelete", method = RequestMethod.GET)
	public String memberDelete(String member_id) {
		int cnt =service.memberDelete(member_id);
		
		return "redirect:/member/memberList";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String searchList(Model model, String start_date, String end_date) {
		ArrayList<MemberVO> list = service.searchList(start_date, end_date);
		
		model.addAttribute("memberList", list);
		return "member/memberList";
	}
	
	@RequestMapping(value = "/selectOne", method = RequestMethod.GET)
	public String memberSelectOne(String member_id, Model model) {
		MemberVO member = service.memberSelectOne(member_id);
		model.addAttribute("member", member);
		
		return "member/memberInfo";
	}
	
	
}
