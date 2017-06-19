package com.squid.bean;

import java.io.Serializable;

/**
 * @author Squid 商品
 */
public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;// 商品编号
	private String name;// 商品名称
	private double price;// 商品价格
	private int numbers;// 商品库存
	private String discription;// 商品介绍
	private int saleType;//商品销售类型，特推产品 0 （最多3件），热卖1，普通产品 2
	private String parameter;// 规格参数
	private String packageList;// 包装清单
	private ProductSecondType productSecondType;// 商品类别
	private String image;//商品图片
	private Publish publish;//商品出版社
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long id, String name, double price, int numbers,
			String discription, int saleType, String parameter,
			String packageList, ProductSecondType productSecondType,
			String image, Publish publish) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.numbers = numbers;
		this.discription = discription;
		this.saleType = saleType;
		this.parameter = parameter;
		this.packageList = packageList;
		this.productSecondType = productSecondType;
		this.image = image;
		this.publish = publish;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ ", numbers=" + numbers + ", discription=" + discription
				+ ", saleType=" + saleType + ", parameter=" + parameter
				+ ", packageList=" + packageList + ", productSecondType="
				+ productSecondType + ", image=" + image + ", publish="
				+ publish + "]";
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public int getSaleType() {
		return saleType;
	}
	public void setSaleType(int saleType) {
		this.saleType = saleType;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public String getPackageList() {
		return packageList;
	}
	public void setPackageList(String packageList) {
		this.packageList = packageList;
	}
	public ProductSecondType getProductSecondType() {
		return productSecondType;
	}
	public void setProductSecondType(ProductSecondType productSecondType) {
		this.productSecondType = productSecondType;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Publish getPublish() {
		return publish;
	}
	public void setPublish(Publish publish) {
		this.publish = publish;
	}
	
	
}
