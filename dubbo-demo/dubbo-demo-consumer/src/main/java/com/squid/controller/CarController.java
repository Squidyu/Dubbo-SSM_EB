package com.squid.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.squid.bean.Car;
import com.squid.bean.Product;
import com.squid.dubbo.demo.service.ICarService;
import com.squid.dubbo.demo.service.IMemberService;
import com.squid.dubbo.demo.service.IProductService;

@Controller
public class CarController {
	@Autowired
	private IProductService productService;
	@Autowired
	private ICarService carService;
	@Autowired
	private IMemberService memberService;
	@RequestMapping(value="/addCar",method = RequestMethod.GET)
	public String addCar(int id) {
		/*Product product = productService.findById(id);
		Member member= memberService.findById(0);*/
		//如果商品存在某用户的购物车，则不添加
		List<Integer> pIdList = carService.findPIdByMId(0);
		for (Integer integer : pIdList) {
			if (id==integer) {
				return "redirect:carInfo";
			}else{
				int car_id=carService.getMaxId()+1;
				Car car = new Car(car_id, id,0);
				carService.insert(car);
				return "redirect:carInfo";
			}
			
		}
		return "redirect:carInfo";
	}
	
	@RequestMapping(value="/carInfo",method = RequestMethod.GET)
	public String carInfo(Model model){
		List<Car> carList=carService.findByMId(0);
		List<Product> products=new ArrayList<Product>();
		
		for (Car car : carList) {
			Product product=productService.findById((int) car.getpId());
			products.add(product);
		}
		model.addAttribute("products", products);
		return "shopCart";
	}
}
