package com.squid.bean;

import java.io.Serializable;

/**
 * @author Squid
 *收货人信息
 */
public class Receiver implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;//收货人编号
	private String name;//收货人姓名
	private String phone;//收货人手机号
	private Address address;//收货人地址
	private Member member;//收货信息所属会员
	public Receiver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Receiver(long id, String name, String phone, Address address,
			Member member) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.member = member;
	}
	@Override
	public String toString() {
		return "Receiver [id=" + id + ", name=" + name + ", phone=" + phone
				+ ", address=" + address + ", member=" + member + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
}