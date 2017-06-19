package com.squid.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Squid
 *商品评价
 */
public class Access implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;//商品评价编号
	private String content;//商品评价内容
	private Member member;//商品评价会员
	private Product product;//被评价商品
	private Date createTime;//评价时间
	private String image;//用户上传图片
	public Access() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Access(long id, String content, Member member, Product product,
			Date createTime,String image) {
		super();
		this.id = id;
		this.content = content;
		this.member = member;
		this.product = product;
		this.createTime = createTime;
		this.image = image;
	}
	@Override
	public String toString() {
		return "Assess [id=" + id + ", content=" + content + ", member="
				+ member + ", product=" + product + ", createTime="
				+ createTime + ", image="
						+ image + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
