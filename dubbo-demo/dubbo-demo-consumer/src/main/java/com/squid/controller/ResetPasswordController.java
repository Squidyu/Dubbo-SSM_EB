package com.squid.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.squid.bean.Member;
import com.squid.bean.ProductFirstType;
import com.squid.dubbo.demo.service.IMemberService;
import com.squid.dubbo.demo.service.IProductFirstTypeService;

@Controller
public class ResetPasswordController {
	@Autowired
	private IProductFirstTypeService pFTService;
	@Autowired
	private IMemberService memberService;

	@RequestMapping(value = "/resetPassword")
	public String resetPassword(Model model) {
		List<ProductFirstType> pFTList = pFTService.findAll();
		model.addAttribute("pFTList", pFTList);
		return "resetPassword";
	}

	@RequestMapping(value = "resetPassword2")
	public String resetPassword2(String name, Model model,HttpSession session) {
		session.setAttribute("name", name);
		List<ProductFirstType> pFTList = pFTService.findAll();

		model.addAttribute("pFTList", pFTList);
		return "resetPassword2";
	}

	@RequestMapping(value = "resetPassword3")
	public String resetPassword3() {

		return "resetPassword3";

	}

	@RequestMapping(value = "resetPassword4")
	public String resetPassword4(String password,Model model, HttpSession session) {
		
		String name = (String) session.getAttribute("name");
		Member member = memberService.selectByName(name);
		member.setPassword(password);
		memberService.updateByName(member);
		List<ProductFirstType> pFTList = pFTService.findAll();
		model.addAttribute("pFTList", pFTList);
		return "resetPassword4";
	}
}
