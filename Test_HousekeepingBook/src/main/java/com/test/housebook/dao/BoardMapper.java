package com.test.housebook.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.test.housebook.vo.BoardVO;

public interface BoardMapper {

	public int boardWrite(BoardVO board);

	public ArrayList<BoardVO> boardList();
}
