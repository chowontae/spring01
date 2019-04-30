package com.example.spring01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	private static final Logger logger = 
			LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("/")	//url pattern mapping
	public String main(Model model) {
		model.addAttribute("message","홈페이지 방문을 환영합니다.");
		//<beans:property name="prefix" value="/WEB-INFO/views/" />
		//<beans:property name="suffix" value=".jsp" />
		// /WEB-INFO/views/main.jsp
		return "main";	// main.jsp로 포워딩됨
	}
		
	@RequestMapping(value="gugu.do", method=RequestMethod.GET)
	/*
	public String gugu(HttpServletRequest reqeust, Model model) {
		int dan = Integer.parseInt(request.getParameter("dan"));
	*/
	//위 와 같이 해도 된다.
	public String gugu(@RequestParam(defaultValue = "5") int dan, Model model) {
		// int dan=7;
		String result = "";
		for(int i=1; i <= 9; i++) {
			result += dan + "x" + i + "=" + dan * i + "<br>";
		}
		
		model.addAttribute("result", result);
		
		return "test/gugu";
	}
	
	//리턴 타입이 void인 경우 RequestMapping과 동일한 페이지로 넘어감
	@RequestMapping("test")
	public void test() {
		
	}
	
	//RequestMapping 명하고 method 명이 같을 필요는 없음
	@RequestMapping("test/doA")
	public String doA(Model model) {
		logger.info("doA called...");
		//model.addAttribute(key, value)
		model.addAttribute("message", "홈페이지 방문을 환영합니다");
		//리턴타입이 void이면 method가 종료된 후 doA.jsp로 포워드 됨
		return "test/doB";	//doB.jsp로 포워딩됨
	}
	
	//void인 경우 url name과 같은 페이지로 포워딩(method name과 
	@RequestMapping("test/doB")
	public void doB() {
		logger.info("doB called..");
		//method가 종료된 후 doB.jsp로 포워딩 됨
	}
}
