package com.squid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.squid.bean.Member;
import com.squid.dubbo.demo.service.IMemberService;

@Controller
public class RegisterController {
	static int count=0;
	@Autowired
	private IMemberService memberService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(){
		return "register";
	}
	
	@RequestMapping(value = "register2", method = RequestMethod.GET)
	public String register2(Member member){
		
		member.setId(count);
		memberService.insert(member);
		count++;
		return "login";
	}
}
