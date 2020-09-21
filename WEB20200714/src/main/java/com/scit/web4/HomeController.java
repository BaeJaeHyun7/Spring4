package com.scit.web4;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		String str1 = "aaa";
		int num1 = 20;
		ArrayList<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		ArrayList<MemberVO> list2 = new ArrayList<MemberVO>();
		
		//1번회원
		MemberVO m1 = new MemberVO();
		m1.setId("id1");
		m1.setPw("pw1");
		m1.setAge(20);
		
		//2번회원
		MemberVO m2 = new MemberVO();
		m2.setId("id2");
		m2.setPw("pw2");
		m2.setAge(30);
				
		//3번회원
		MemberVO m3 = new MemberVO();
		m3.setId("id3");
		m3.setPw("pw3");
		m3.setAge(40);
		
		list2.add(m1);
		list2.add(m2);
		list2.add(m3);
		
		model.addAttribute("list2", list2);
		model.addAttribute("str", str1);
		model.addAttribute("num", num1);
		model.addAttribute("list", list);
		
		
		
		return "home";
	}
	
}
