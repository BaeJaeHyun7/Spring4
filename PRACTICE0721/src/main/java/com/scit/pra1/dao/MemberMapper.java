package com.scit.pra1.dao;

import java.util.ArrayList;

import com.scit.pra1.vo.MemberVO;

public interface MemberMapper {
	
	public int memberJoin(MemberVO member);
	public ArrayList<MemberVO> memberList();
	public int memberDelete(String member_id);
}
