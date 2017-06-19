package com.squid.dubbo.demo.service;

import com.squid.bean.Member;

public interface IMemberService {
	Member findById(int id);
	void insert(Member member);
	Member selectByName(String name);
	void updateByName(Member member);
	void updateInfo(Member member);
}
