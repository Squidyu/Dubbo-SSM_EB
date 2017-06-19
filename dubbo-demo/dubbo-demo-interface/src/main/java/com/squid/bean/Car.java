package com.squid.bean;

import java.io.Serializable;


/**
 * @author Squid
 *购物车
 */
public class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;//购物车编号
	private long pId;//购物车内商品id
	private long mId;//所属会员id
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(long id, long pId, long mId) {
		super();
		this.id = id;
		this.pId = pId;
		this.mId = mId;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", pId=" + pId + ", mId=" + mId + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
	}
	public long getmId() {
		return mId;
	}
	public void setmId(long mId) {
		this.mId = mId;
	}
	
}
