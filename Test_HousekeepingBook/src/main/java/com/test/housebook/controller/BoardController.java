package com.test.housebook.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.housebook.service.BoardService;
import com.test.housebook.vo.BoardVO;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	private BoardService service;
	
	@RequestMapping(value = "/goboardList", method = RequestMethod.GET)
	public String board(){
		
		logger.info("가계부 이동");
		
		return "/board/boardList";
	}
	
	@RequestMapping(value = "/boardWriteForm", method = RequestMethod.GET)
	public String boardWriteForm() {
		
		logger.info("가계부 작성");
		
		return "board/boardWriteForm";
	}
	
	@RequestMapping(value = "/boardWrite", method = RequestMethod.POST)
	public String boardWrite(BoardVO board) {
		
		service.boardWrite(board);
		
		return "redirect:/board/boardList";
	}
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String boardList(Model model) {
		
		logger.info("가계부 목록 페이지 이동");
		
		ArrayList<BoardVO> list = service.boardList();
		
		model.addAttribute("list", list);
		
		return "board/boardList";
	}
	
}
