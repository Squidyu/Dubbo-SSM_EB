package com.squid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.squid.bean.Product;
import com.squid.bean.ProductFirstType;
import com.squid.dubbo.demo.service.IProductFirstTypeService;
import com.squid.dubbo.demo.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductFirstTypeService pFTService;
	@Autowired
	private IProductService productService;

	@RequestMapping(value = "/productInfo", method = RequestMethod.GET)
	public String productInfo(int id, Model model) {
		List<ProductFirstType> pFTList = pFTService.findAll();
		Product product = productService.findById(id);
		System.out.println(product.toString());
		model.addAttribute("product", product);
		model.addAttribute("pFTList", pFTList);
		return "viewBook";
	}
}
