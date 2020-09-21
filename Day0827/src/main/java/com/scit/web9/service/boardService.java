package com.scit.web9.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.scit.web9.dao.boardDao;

import com.scit.web9.vo.boardVo;

@Service
public class boardService {
	
	@Autowired
	private boardDao dao;
	
	@Autowired
	private HttpSession session;
	
	public int boardWrite(boardVo board) {
		
		String member_id = (String)session.getAttribute("loginId");
		board.setMember_id(member_id);
		
		int cnt = dao.boardWrite(board);
		return cnt;
	}
		
		public ArrayList<HashMap<String, Object>>boardList(){
			
			ArrayList<HashMap<String, Object>> list = dao.boardList();
			return list;
		}
		
		
		public HashMap<String, Object>boardRead(int board_no){
			dao.boardHits(board_no);
			HashMap<String, Object> map = dao.boardRead(board_no);
			return map;
		}
		
		public int boardUpdate(boardVo board) {
			String member_id = (String)session.getAttribute("loginId");
			board.setMember_id(member_id);
			int cnt = dao.boardUpdate(board);
			return cnt;
		}
		
		public int boardDelete(int board_no) {
			
			int cnt = dao.boardDelete(board_no);
			return cnt;
		}
		
		public ArrayList<HashMap<String, Object>>searchBoard(String searchType,String searchText){
			
			HashMap<String, Object>map = new HashMap<String, Object>();
			map.put("searchText", searchText);
			map.put("searchType", searchType);
			ArrayList<HashMap<String, Object>> list = dao.searchBoard(map);
			return list;
		}
		
	

}
