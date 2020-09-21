package com.scit.web10.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web10.dao.MemberDAO;
import com.scit.web10.dao.MemberMapper;
import com.scit.web10.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	public MemberDAO dao;

	public String memberJoin(MemberVO member) {
		int cnt = dao.memberJoin(member);
		String page = "";
		if (cnt ==0) {
			page = "redirect:/member/joinFail";
		}else {
			page = "redirect:/";
		}
		
		return page;
	}
	
	public ArrayList<MemberVO> memberList(){
		
		ArrayList<MemberVO> list = dao.memberList();
			
		return list;
	}
	
	public int memberDelete(String member_id) {
		int cnt = dao.memberDelete(member_id);
		return cnt;
	}
	
	public ArrayList<MemberVO> searchList(String start_date, String end_date){
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("start_date", start_date);
		map.put("end_date", end_date);
		
		ArrayList<MemberVO> list = dao.searchList(map);
			
		return list;
	}
	
	public MemberVO memberSelectOne(String member_id) {
		MemberVO member = dao.memberSelectOne(member_id);
		return member;
	}
}
