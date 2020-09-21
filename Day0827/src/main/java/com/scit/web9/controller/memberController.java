package com.scit.web9.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scit.web9.vo.memberVo;

import com.scit.web9.service.memberService;


@Controller
@RequestMapping(value = "/member")
public class memberController {
	
	@Autowired
	private memberService service;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping(value = "/joinForm",method = RequestMethod.GET)
	public String joinForm() {
		
		return "member/joinForm";
	}
	
	@RequestMapping(value = "/listForm",method = RequestMethod.GET)
	public String listForm(Model model) {
		
		String loginId = (String)session.getAttribute("loginId");
		
		String page = "";
		
		if(loginId != null) {
			ArrayList<memberVo>list = service.memberSelect();
			model.addAttribute("list", list);
			page = "member/listForm";
		}else {
			page = "redirect:/member/loginForm";
		}
		
		
		return page;
	}
	
	@RequestMapping(value = "/join",method = RequestMethod.POST)
	public String join(memberVo member) {
		String page = service.memberInsert(member);
		return page;
	}
	
	@RequestMapping(value = "/joinFail", method = RequestMethod.GET)
	public String joinFail() {
		
		return "member/joinFail";
	}
	
	@RequestMapping(value = "/memberSearch",method = RequestMethod.POST)
	public String memberSearch(String start_date,String end_date,Model model) {
		
		
		ArrayList<memberVo> list = service.memberSearch(start_date, end_date);
		model.addAttribute("list", list);
		
		return "member/listForm";
	}
	@RequestMapping(value = "/memberSelectOne",method = RequestMethod.GET)
	public String memberSelectOne(String member_id,Model model) {
		memberVo member = service.memberSelectOne(member_id);
		model.addAttribute("member", member);
		
		return "member/memberInfo";
	}
	
	@RequestMapping(value = "/memberDelete",method = RequestMethod.GET)
	public String memberDelete(String member_id) {
		service.memberDelete(member_id);
		return "redirect:/member/listForm";		
	}
	
	@RequestMapping(value = "/memberUpdateForm",method = RequestMethod.GET)
	public String memberUpdateForm(String member_id,Model model) {
		memberVo member = service.memberSelectOne(member_id);
		model.addAttribute("member", member);
		
		return "member/memberUpdateForm";
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String update(memberVo member) {
		service.memberUpdate(member);
		
		return "redirect:/member/listForm";
	}
	
	@RequestMapping(value = "/loginForm",method = RequestMethod.GET)
	public String loginForm() {
		return "member/memberLoginForm";
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String loginForm(memberVo member) {
		
		String page = service.login(member);
		
		return page;
	}
	
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String logout() {
		
		service.logout();
		
		return "redirect:/";
	}
	
		@ResponseBody
	   @RequestMapping(value = "/idCheck", method = RequestMethod.GET, produces = "application/test;charset=utf-8")
	   public String idCheck(String member_id) {
	      memberVo member = service.memberSelectOne(member_id);
	      String result = "";
	      if(member==null) {
	         result ="사용 할 수 있는 ID입니다.";
	      }else {
	         result="이미 사용 중인 ID입니다.";
	      }
	      
	      if(member_id.length()==0 || member_id.length()<4 || member_id.length()>12) {
	         result="";
	      }
	      
	      return result;
	   }
	
	

}
