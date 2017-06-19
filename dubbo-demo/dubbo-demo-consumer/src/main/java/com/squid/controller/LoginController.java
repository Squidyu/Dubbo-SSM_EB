package com.squid.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.squid.bean.Member;
import com.squid.dubbo.demo.service.IMemberService;

/**
 * @author Squid
 *
 */
@Controller
public class LoginController {

	@Autowired
	private IMemberService memberService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String validate(String name, String password, Model model,
			HttpServletRequest request) {
		HttpSession session = request.getSession();
		Member member = memberService.selectByName(name);
		if (password.equals(member.getPassword())) {

			session.setAttribute("member", member);

			return "redirect:index";
		} else {
			return "login";
		}

	}
}
