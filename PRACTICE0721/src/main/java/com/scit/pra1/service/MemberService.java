package com.scit.pra1.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.pra1.dao.MemberDAO;
import com.scit.pra1.dao.MemberMapper;
import com.scit.pra1.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	
	public String memberJoin(MemberVO member) {
		
		int cnt =dao.memberJoin(member);
		String page = "";
		
		if (cnt ==0) {
			page = "redirect:/member/joinFail";
		} else {
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
}
