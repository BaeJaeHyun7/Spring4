package com.test.housebook.dao;

import java.util.ArrayList;

import com.test.housebook.vo.BoardVO;
import com.test.housebook.vo.MemberVO;

public interface MemberMapper {

	public int memberJoin(MemberVO member);

	public MemberVO memberSelectOne(String acc_id);


	
}
