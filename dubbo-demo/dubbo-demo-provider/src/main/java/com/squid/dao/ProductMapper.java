package com.squid.dao;

import java.util.List;

import com.squid.bean.Product;

public interface ProductMapper {
	List<Product> findBySaleType(int saleType);

	Product findById(int id);
}
