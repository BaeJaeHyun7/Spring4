package com.scit.web9.dao;

import java.util.ArrayList;
import java.util.HashMap;


import com.scit.web9.vo.boardVo;

public interface boardMapper {
	
	public int boardWrite(boardVo board);
	
	public ArrayList<HashMap<String, Object>>boardList();
	
	public void updateHits(int board_no);
	
	public HashMap<String, Object> boardRead(int board_no);
	
	public int boardDelete(int board_no);
	
	public int boardUpdate(boardVo board);
	
	public ArrayList<HashMap<String, Object>>searchBoard(HashMap<String, Object>map); 

	
}
