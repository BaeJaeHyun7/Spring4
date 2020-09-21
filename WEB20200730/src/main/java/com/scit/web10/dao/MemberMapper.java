package com.scit.web10.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.web10.vo.MemberVO;

public interface MemberMapper {

	public int memberJoin(MemberVO member);
	public ArrayList<MemberVO> memberList();
	public int memberDelete(String member_id);
	public ArrayList<MemberVO> searchList(HashMap<String,String> map);
	public MemberVO memberSelectOne(String member_id);
}
