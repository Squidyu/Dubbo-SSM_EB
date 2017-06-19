package com.squid.dubbo.demo.service;

import java.util.List;

import com.squid.bean.Product;

public interface IProductService {
	List<Product> findBySaleType(int saleType);

	Product findById(int id);
}
