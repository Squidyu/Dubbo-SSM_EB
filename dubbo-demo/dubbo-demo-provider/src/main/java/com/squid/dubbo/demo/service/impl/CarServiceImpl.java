package com.squid.dubbo.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squid.bean.Car;
import com.squid.dao.CarMapper;
import com.squid.dubbo.demo.service.ICarService;
@Service
public class CarServiceImpl implements ICarService {

	@Autowired
	private CarMapper carMapper;
	
	@Override
	public void insert(Car car) {
		carMapper.insert(car);
	}


	@Override
	public List<Integer> findPIdByMId(int m_id) {
		// TODO Auto-generated method stub
		return carMapper.findPIdByMId(m_id);
	}

	@Override
	public List<Car> findByMId(int m_id) {
		// TODO Auto-generated method stub
		return carMapper.findByMId(m_id);
	}


	@Override
	public int getMaxId() {
		// TODO Auto-generated method stub
		return carMapper.getMaxId();
	}

}
