package com.squid.dubbo.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squid.bean.Product;
import com.squid.dao.ProductMapper;
import com.squid.dubbo.demo.service.IProductService;
/**
 * @author Squid
 *
 */
@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ProductMapper productMapper;
	@Override
	public List<Product> findBySaleType(int saleType) {
		// TODO Auto-generated method stub
		return productMapper.findBySaleType(saleType);
	}
	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return productMapper.findById(id);
	}

}
