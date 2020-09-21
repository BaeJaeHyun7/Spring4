package com.test.housebook.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.housebook.dao.BoardDAO;
import com.test.housebook.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;
	
	@Autowired
	private HttpSession session;
	
	public int boardWrite(BoardVO board) {
		String acc_id = (String)session.getAttribute("loginId");
		board.setAcc_id(acc_id);
		
		System.out.println(acc_id);
		int cnt =dao.boardWrite(board);
		
		
		return cnt;
	}

	public ArrayList<BoardVO> boardList() {
		ArrayList<BoardVO> list = dao.boardList();
		
		return list;
	}

}
