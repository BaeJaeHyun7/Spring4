package com.test.housebook.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.housebook.vo.BoardVO;

@Repository
public class BoardDAO {

	@Autowired
	private SqlSession session;
	
	public int boardWrite(BoardVO board) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int cnt =0;
		
		try {
			
			cnt = mapper.boardWrite(board);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	public ArrayList<BoardVO> boardList() {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		ArrayList<BoardVO> list = null;
		
		try {
			list = mapper.boardList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}


}
