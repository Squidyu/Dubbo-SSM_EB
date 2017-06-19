package com.squid.dao;

import com.squid.bean.Member;

public interface MemberMapper {

	Member findById(int id);
	void insert(Member member);
	Member selectByName(String name);
	void updateByName(String name,String password);
	void updateByName(Member member);
	void updateInfo(Member member);
}
