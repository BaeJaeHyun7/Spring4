package com.scit.pra1.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.pra1.service.MemberService;
import com.scit.pra1.vo.MemberVO;

@Controller
@RequestMapping(value = "/member", method = RequestMethod.GET)
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MemberService service;
	
	@RequestMapping(value = "/joinForm")
	public String joinForm() {
		
		logger.info("회원 가입 폼 이동");
		
		return "member/joinForm";
	}
	
	@RequestMapping(value = "/join" , method = RequestMethod.POST)
	public String memberJoin(MemberVO member) {
		
		logger.info("회원 가입{}", member);
		
		String page = service.memberJoin(member);
		
		return page;
	}
	
	@RequestMapping(value = "/joinFail", method = RequestMethod.GET)
	public String joinFail() {
		
		return "member/joinFail";
	}
	
	@RequestMapping(value = "/joinList", method = RequestMethod.GET)
	public String joinList(Model model) {
		ArrayList<MemberVO> list = service.memberList();
		
		model.addAttribute("memberList", list);
		
		return "member/joinList";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String memberDelete(String member_id) {
		
		int cnt = service.memberDelete(member_id);
		
		return "redirect:/member/joinList";
	}
}
