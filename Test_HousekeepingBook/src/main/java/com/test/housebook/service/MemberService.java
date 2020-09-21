package com.test.housebook.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.housebook.dao.MemberDAO;
import com.test.housebook.dao.MemberMapper;
import com.test.housebook.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	
	@Autowired
	private HttpSession session;
	
	public String memberJoin(MemberVO member) {
		int cnt = dao.memberJoin(member);
		
		String page = "";
		
		if (cnt ==0) {
			page = "redirect:/member/joinForm";
		}else {
			page="redirect:/member/loginForm";
		}
		
		return page;
	}

	public String memberLogin(MemberVO member) {
		MemberVO loginCheck = dao.memberSelectOne(member.getAcc_id());
		String page = "";
		
		if (loginCheck != null && loginCheck.getAcc_pw().equals(member.getAcc_pw())) {
			session.setAttribute("loginId", member.getAcc_id());
			page = "redirect:/";
		} else {
			page = "redirect:/member/loginForm";
		}
		
		return page;
	}

	public void memberLogout() {
		session.removeAttribute("loginId");
		
	}
}
