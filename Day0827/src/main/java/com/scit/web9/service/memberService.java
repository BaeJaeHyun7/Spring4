package com.scit.web9.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web9.dao.memberDao;
import com.scit.web9.vo.memberVo;

@Service
public class memberService {
	
	@Autowired
	private memberDao dao;
	
	@Autowired
	private HttpSession session;
	
	public String memberInsert(memberVo member) {
		
		String page = "";
		
		int cnt = dao.memberInsert(member);
		if(cnt == 0) {
			page = "redirect:/member/joinFail";			
		}else {
			page = "redirect:/";
		}
		
		return page;
	}
	
	public ArrayList<memberVo>memberSelect(){
		
		ArrayList<memberVo>list =  dao.memberSelect();
		
		return list;
	}
	
	public int memberDelete(String member_id) {
		
		int cnt = dao.memberDelete(member_id);
		
		return cnt;
	}
	
	public memberVo memberSelectOne(String member_id) {
		
		memberVo member = dao.memberSelectOne(member_id);
		
		return member;
	}
	
	public ArrayList<memberVo>memberSearch(String start_date,String end_date){
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("start_date", start_date);
		map.put("end_date", end_date);
		
		ArrayList<memberVo>list = dao.memberSearch(map);
		
		return list;
	}
	
	public int memberUpdate(memberVo member) {
		
		int cnt = dao.memberUpdate(member);
		
		return cnt;
	}
	
	public String login(memberVo member) {
		memberVo loginCheck = dao.memberSelectOne(member.getMember_id());
		String page = "";
		if(loginCheck != null && loginCheck.getMember_pw().equals(member.getMember_pw())) {
			session.setAttribute("loginId", member.getMember_id());
			page = "redirect:/";
		}else {
			page = "redirect:/member/loginForm";
		}
		return page;
	}
	
	public void logout() {
		session.removeAttribute("loginId");
		
	}

}
