package com.scit.web6.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.RowBounds;

import com.scit.web6.vo.BoardVO;

public interface BoardMapper {

	public int boardWrite(BoardVO board);
	public ArrayList<HashMap<String, Object>> boardList(HashMap<String, Object> map, RowBounds rb);
	public void updateHits(int board_no);
	public HashMap<String, Object> boardRead(int board_no);
	public int boardDelete(int board_no);
	public int boardUpdate(BoardVO board);
	//public ArrayList<HashMap<String, Object>> searchBoard(HashMap<String, Object> map);
	public BoardVO boardSelectOne(int board_no);
	public int boardCount(HashMap<String, Object> map);
}
