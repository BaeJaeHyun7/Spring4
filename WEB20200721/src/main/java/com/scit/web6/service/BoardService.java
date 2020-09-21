package com.scit.web6.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web6.dao.BoardDAO;
import com.scit.web6.dao.BoardMapper;
import com.scit.web6.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO dao;
	
	@Autowired
	private HttpSession session;
	
	
	public int boardWrite(BoardVO board) {
		
		//member_id를 추가해야한다.
		String member_id = (String)session.getAttribute("loginId");
		board.setMember_id(member_id);
		
		int cnt =dao.boardWrite(board);
			
		return cnt;
	}
	
	public ArrayList<HashMap<String, Object>> boardList(String searchText, String searchType
			, int startRecord, int countPerPage){
		HashMap<String, Object> map = new HashMap<>();
		map.put("searchText", searchText);
		map.put("searchType", searchType);
		
		ArrayList<HashMap<String, Object>> list = dao.boardList(map, startRecord, countPerPage);
		return list;
	}
	
	public HashMap<String, Object> boardRead(int board_no){
		//조회수 증가
		dao.updateHits(board_no);
		//해당 글 조회
		HashMap<String, Object> map = dao.boardRead(board_no);
		
		return map;
	}
	
	public int boardDelete(int board_no) {
		int cnt = dao.boardDelete(board_no);
		
		return cnt;
	}
	
	public int boardUpdate(BoardVO board) {
		String member_id = (String)session.getAttribute("loginId");
		board.setMember_id(member_id);
		int cnt = dao.boardUpdate(board);
		
		return cnt;
	}
	
	/*
	 * public ArrayList<HashMap<String, Object>> searchBoard(String searchText,
	 * String searchType){ HashMap<String, Object> map = new HashMap<String,
	 * Object>(); map.put("searchText", searchText); map.put("searchType",
	 * searchType);
	 * 
	 * ArrayList<HashMap<String, Object>> list = dao.searchBoard(map); return list;
	 * }
	 */
	
	public BoardVO boardSelectOne(int board_no) {
		BoardVO board = dao.boardSelectOne(board_no);
		return board;
	}
	
	public int boardCount(String searchText, String searchType) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("searchText", searchText);
		map.put("searchType", searchType);
		
		int count = dao.boardCount(map);
		
		return count;
		
		
	
	}
}
