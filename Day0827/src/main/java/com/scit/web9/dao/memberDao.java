package com.scit.web9.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.scit.web9.vo.memberVo;

@Repository
public class memberDao {
	
	@Autowired
	private SqlSession session;
	
	public int memberInsert(memberVo member) {
		memberMapper mapper = session.getMapper(memberMapper.class);
		int cnt = 0;
		
		try {
			cnt = mapper.memberInsert(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public ArrayList<memberVo>memberSelect(){
		memberMapper mapper = session.getMapper(memberMapper.class);
		ArrayList<memberVo>list = null;
		
		try {
			list = mapper.memberSelect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int memberDelete(String member_id) {
		memberMapper mapper = session.getMapper(memberMapper.class);
		int cnt = 0;
		
		try {
			cnt = mapper.memberDelete(member_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public memberVo memberSelectOne(String member_id) {
		memberMapper mapper = session.getMapper(memberMapper.class);
		memberVo member = null;
		
		try {
			member = mapper.memberSelectOne(member_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}
	
	public ArrayList<memberVo>memberSearch(HashMap<String, String>map){
		memberMapper mapper = session.getMapper(memberMapper.class);
		ArrayList<memberVo>list = null;
		
		try {
			list = mapper.memberSearch(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int memberUpdate(memberVo member) {
		memberMapper mapper = session.getMapper(memberMapper.class);
		int cnt = 0;
		
		try {
			cnt = mapper.memberUpdate(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
