package com.scit.web6.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web6.dao.MemberDAO;
import com.scit.web6.dao.MemberMapper;
import com.scit.web6.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	
	@Autowired
	private HttpSession session;
	
public String memberJoin(MemberVO member) {
		
		int cnt = dao.memberJoin(member);
		
		String page = "";
		
		if (cnt == 0) {
			page = "redirect:/member/joinFail";
		} else {
			page = "redirect:/";
		}
		
		return page;
	}

public ArrayList<MemberVO> joinList(){
	ArrayList<MemberVO> list = dao.joinList();
	return list;
}

public int memberDelete(String member_id) {
	int cnt = dao.memberDelete(member_id);
	return cnt;
}

public MemberVO memberSelectOne(String member_id) {
	MemberVO member =dao.memberSelectOne(member_id);
	return member;

	}

public int memberUpdate(MemberVO member) {
	int cnt = dao.memberUpdate(member);
	return cnt;
}

public String memberLogin(MemberVO member) {
		MemberVO loginCheck = dao.memberSelectOne(member.getMember_id());
		//로그인 성공 여부에 따라서 리턴될 값
		String page = "";
		
		if (loginCheck != null && loginCheck.getMember_pw().equals(member.getMember_pw())) {
			//로그인 성공
			//SessionScope가 필요한 상황 -> HttpSession객체가 SessionScope 입니다.
			session.setAttribute("loginId", member.getMember_id());
			//메인 페이지로 redirect. forward를 쓴다면 새로고침 때마다 sessionscope에 계속 정보가 주입된다.
			page = "redirect:/";
		} else {
			//로그인 실패
			page = "redirect:/member/loginForm";
		}
		
		return page;
	}

	public void memberLogout() {
		//session에서 로그인정보를 삭제
		session.removeAttribute("loginId");
		
	}
}
