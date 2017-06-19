package com.squid.bean;

import java.io.Serializable;

/**
 * @author Squid 商品一级分类
 */
public class ProductFirstType implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;// 一级商品分类编号
	private String name;// 商品一级分类名称

	public ProductFirstType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductFirstType(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProductFirstType [id=" + id + ", name=" + name + "]";
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

}
