package com.scit.web9.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.web9.dao.boardMapper;

import com.scit.web9.vo.boardVo;

@Repository
public class boardDao {
	
	@Autowired
	private SqlSession session;
	
	public int boardWrite(boardVo board) {
	boardMapper mapper = session.getMapper(boardMapper.class);
	int cnt = 0;
	
	try {
		cnt = mapper.boardWrite(board);
	} catch (Exception e) {
		e.printStackTrace();
	}return cnt;
}
	
	public ArrayList<HashMap<String, Object>>boardList(){
		boardMapper mapper = session.getMapper(boardMapper.class);
		ArrayList<HashMap<String, Object>> list = null;
		try {
			list = mapper.boardList();
		} catch (Exception e) {
			e.printStackTrace();
		}return list;
	}
	
	public void boardHits(int board_no) {
		boardMapper mapper = session.getMapper(boardMapper.class);
		
		try {
			mapper.updateHits(board_no);
		} catch (Exception e) {
			e.printStackTrace();
			}	
		
	}
	
	public HashMap<String, Object>boardRead(int board_no){
		boardMapper mapper = session.getMapper(boardMapper.class);
		HashMap<String, Object> map = null;
		try {
			map = mapper.boardRead(board_no);
		} catch (Exception e) {
			e.printStackTrace();
		}return map;
	}
	
	public int boardUpdate(boardVo board) {
		boardMapper mapper = session.getMapper(boardMapper.class);
		int cnt = 0;
		try {
			cnt = mapper.boardUpdate(board);
		} catch (Exception e) {
			e.printStackTrace();
		}return cnt;
	}
	
	public int boardDelete(int board_no) {
		boardMapper mapper = session.getMapper(boardMapper.class);
		int cnt = 0;
		try {
			cnt = mapper.boardDelete(board_no);
		} catch (Exception e) {
			e.printStackTrace();
		}return cnt;
	}
	
	public ArrayList<HashMap<String, Object>>searchBoard(HashMap<String, Object>map){
		boardMapper mapper = session.getMapper(boardMapper.class);
		ArrayList<HashMap<String, Object>> list = null;
		try {
			list = mapper.searchBoard(map);
		} catch (Exception e) {
			e.printStackTrace();
		}return list;
	}
	
	

}
