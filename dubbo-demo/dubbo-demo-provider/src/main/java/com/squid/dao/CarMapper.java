package com.squid.dao;

import java.util.List;

import com.squid.bean.Car;

public interface CarMapper {
	void insert(Car car);
	List<Integer> findPIdByMId(int m_id);
	List<Car> findByMId(int m_id);
	int getMaxId();
}
