package com.squid.bean;

import java.io.Serializable;

/**
 * @author Squid 快讯
 */
public class New implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;// 快讯编号
	private String title;// 快讯标题
	private String content;// 快讯内容
	private Product product;// 快讯商品

	public New() {
		super();
		// TODO Auto-generated constructor stub
	}

	public New(long id, String title, String content, Product product) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.product = product;
	}

	@Override
	public String toString() {
		return "New [id=" + id + ", title=" + title + ", content=" + content
				+ ", product=" + product + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
