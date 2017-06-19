package com.squid.dubbo.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squid.bean.ProductSecondType;
import com.squid.dao.ProductSecondTypeMapper;
import com.squid.dubbo.demo.service.IProductSecondTypeService;
@Service
public class ProductSecondServiceImpl implements IProductSecondTypeService {
	@Autowired
	private ProductSecondTypeMapper mapper;
	@Override
	public List<ProductSecondType> findByFId(long id) {
		// TODO Auto-generated method stub
		return mapper.findByFId(id);
	}

}
