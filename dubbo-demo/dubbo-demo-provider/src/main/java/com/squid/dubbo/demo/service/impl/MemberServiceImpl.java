package com.squid.dubbo.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squid.bean.Member;
import com.squid.dao.MemberMapper;
import com.squid.dubbo.demo.service.IMemberService;
@Service
public class MemberServiceImpl implements IMemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public void insert(Member member) {
		memberMapper.insert(member);
	}
	@Override
	public Member selectByName(String name) {
		// TODO Auto-generated method stub
		return memberMapper.selectByName(name);
	}
	@Override
	public void updateByName(Member member) {
		memberMapper.updateByName(member);
	}
	@Override
	public Member findById(int id) {
		// TODO Auto-generated method stub
		return memberMapper.findById(id);
	}
	@Override
	public void updateInfo(Member member) {
		memberMapper.updateInfo(member);
	}
}
