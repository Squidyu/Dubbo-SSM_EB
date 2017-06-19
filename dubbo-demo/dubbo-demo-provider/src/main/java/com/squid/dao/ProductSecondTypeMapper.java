package com.squid.dao;

import java.util.List;

import com.squid.bean.ProductSecondType;

public interface ProductSecondTypeMapper {
	List<ProductSecondType> findByFId(long id);
}
