package com.squid.dubbo.demo.service;

import java.util.List;

import com.squid.bean.ProductSecondType;

public interface IProductSecondTypeService {
	List<ProductSecondType> findByFId(long id);
}
