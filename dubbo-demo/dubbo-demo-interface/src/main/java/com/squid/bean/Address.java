package com.squid.bean;

import java.io.Serializable;

/**
 * @author Squid
 *收货地址
 */
public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;//收货地址编号
	private int postcode;//邮编
	private String country;//国家
	private String provience;//省份
	private String city;//城市
	private String detail;//详细地址
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(long id, int postcode, String country, String provience,
			String city, String detail) {
		super();
		this.id = id;
		this.postcode = postcode;
		this.country = country;
		this.provience = provience;
		this.city = city;
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", postcode=" + postcode + ", country="
				+ country + ", provience=" + provience + ", city=" + city
				+ ", detail=" + detail + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvience() {
		return provience;
	}
	public void setProvience(String provience) {
		this.provience = provience;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
