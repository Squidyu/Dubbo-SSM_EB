package com.squid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.squid.bean.Member;
import com.squid.bean.ProductFirstType;
import com.squid.dubbo.demo.service.IMemberService;
import com.squid.dubbo.demo.service.IProductFirstTypeService;

@Controller
public class UserController {

	@Autowired
	private IProductFirstTypeService pFTService;
	@Autowired
	private IMemberService memberService;
	
	@RequestMapping(value="/userinfo",method=RequestMethod.GET)
	public String userinfo(int id,	Model model) {
		Member member=memberService.findById(0);
		List<ProductFirstType> pFTList=pFTService.findAll();
		
		model.addAttribute("member", member);
		model.addAttribute("pFTList", pFTList);
		return "userinfo";
	}
	
	@RequestMapping(value="updateinfo",method=RequestMethod.GET)
	public String updateinfo(Member member) {
		memberService.updateInfo(member);
		return "redirect:index";
	}
	
	
}
