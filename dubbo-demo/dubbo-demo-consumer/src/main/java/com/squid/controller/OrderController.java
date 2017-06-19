package com.squid.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Squid
 *
 */
@Controller
public class OrderController {


	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String order(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("member");
		return "confirm";
	}

}
