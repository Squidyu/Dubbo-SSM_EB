package com.squid.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.squid.bean.Product;
import com.squid.bean.ProductFirstType;
import com.squid.bean.ProductSecondType;
import com.squid.dubbo.demo.service.IProductFirstTypeService;
import com.squid.dubbo.demo.service.IProductSecondTypeService;
import com.squid.dubbo.demo.service.IProductService;

@Controller
public class BaseController {
	@Autowired
	private IProductFirstTypeService pFTService;
	@Autowired
	private IProductSecondTypeService pSTService;
	@Autowired
	private IProductService productService;

	@RequestMapping(value = {"/index",""}, method = RequestMethod.GET)
	public String index(Model model) {

		List<ProductFirstType> pFTList = pFTService.findAll();
		HashMap<ProductFirstType, List<ProductSecondType>> map = new HashMap<ProductFirstType, List<ProductSecondType>>();

		for (ProductFirstType pFT : pFTList) {
			map.put(pFT, pSTService.findByFId(pFT.getId()));
		}
		//特推书籍
		List<Product> productList = productService.findBySaleType(0);
		//热销书籍
		List<Product> productList2 = productService.findBySaleType(1);
		model.addAttribute("map", map);
		model.addAttribute("pFTList", pFTList);
		model.addAttribute("productList", productList);
		model.addAttribute("productList2", productList2);
		return "index";
	}
}
