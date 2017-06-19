package com.squid.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Squid
 *订单
 */
public class Order implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;//订单编号
	private PayWay payWay;//支付方式
	private List<Product> products;//订单内商品
	private Member member;//订单所属会员
	private Date createTime;//下单时间
	private Receiver receiver;//订单收货信息
	private int sumPrice;//总价
	private String status;//状态
	private String image;//图片
	private String flag;//
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(long id, PayWay payWay, List<Product> products, Member member,
			Date createTime, Receiver receiver, int sumPrice, String status,
			String image, String flag) {
		super();
		this.id = id;
		this.payWay = payWay;
		this.products = products;
		this.member = member;
		this.createTime = createTime;
		this.receiver = receiver;
		this.sumPrice = sumPrice;
		this.status = status;
		this.image = image;
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", payWay=" + payWay + ", products="
				+ products + ", member=" + member + ", createTime="
				+ createTime + ", receiver=" + receiver + ", sumPrice="
				+ sumPrice + ", status=" + status + ", image=" + image
				+ ", flag=" + flag + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public PayWay getPayWay() {
		return payWay;
	}
	public void setPayWay(PayWay payWay) {
		this.payWay = payWay;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Receiver getReceiver() {
		return receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	public int getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(int sumPrice) {
		this.sumPrice = sumPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
