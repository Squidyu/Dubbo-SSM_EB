package com.squid.bean;

import java.io.Serializable;

public class PayWay implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String payStyle;//支付方式
	private String image;//支付方式图片
	public PayWay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PayWay(long id, String payStyle, String image) {
		super();
		this.id = id;
		this.payStyle = payStyle;
		this.image = image;
	}
	@Override
	public String toString() {
		return "PayWay [id=" + id + ", payStyle=" + payStyle + ", image="
				+ image + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPayStyle() {
		return payStyle;
	}
	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
