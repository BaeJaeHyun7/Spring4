package com.scit.web9.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.web9.vo.memberVo;

public interface memberMapper {
	
	public int memberInsert(memberVo member);
	
	public ArrayList<memberVo> memberSelect();
	
	public int memberDelete(String member_id);
	
	public int memberUpdate(memberVo member);
	
	public memberVo memberSelectOne(String member_id);
	
	public ArrayList<memberVo> memberSearch(HashMap<String, String>map);

}
