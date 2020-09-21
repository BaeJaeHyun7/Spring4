package com.test.housebook.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.housebook.vo.MemberVO;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSession session;
	
	public int memberJoin(MemberVO member) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt =0;
		
		try {
			cnt= mapper.memberJoin(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	public MemberVO memberSelectOne(String acc_id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		MemberVO member = null;
		
		try {
			member = mapper.memberSelectOne(acc_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}
}
