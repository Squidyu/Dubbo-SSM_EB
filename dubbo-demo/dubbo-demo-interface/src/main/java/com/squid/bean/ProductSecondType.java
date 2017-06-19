package com.squid.bean;

import java.io.Serializable;

/**
 * @author Squid 商品二级分类
 */
public class ProductSecondType implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;// 商品二级分类编号
	private String name;// 商品二级分类名称
	private ProductFirstType productFirstType;// 商品一级分类
	
	public ProductSecondType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductSecondType(long id, String name,
			ProductFirstType productFirstType) {
		super();
		this.id = id;
		this.name = name;
		this.productFirstType = productFirstType;
	}

	@Override
	public String toString() {
		return "ProductSecondType [id=" + id + ", name=" + name
				+ ", productFirstType=" + productFirstType + "]";
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

	public ProductFirstType getProductFirstType() {
		return productFirstType;
	}

	public void setProductFirstType(ProductFirstType productFirstType) {
		this.productFirstType = productFirstType;
	}

}
