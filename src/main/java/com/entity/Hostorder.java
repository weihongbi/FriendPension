package com.entity;

import java.util.Date;

public class Hostorder {
	private int hoid;
	private int cid;
	private Date checktime;
	private Date leavetime;
	private int money;
	private int hid;
	private int states;
	private Date Orderstime;
	private Date checkouttime;
	private int price;
	public Hostorder() {
		super();
	}	
	public Hostorder(int hoid, int cid, Date checktime, Date leavetime, int money, int hid, int states, Date orderstime,
			Date checkouttime, int price) {
		super();
		this.hoid = hoid;
		this.cid = cid;
		this.checktime = checktime;
		this.leavetime = leavetime;
		this.money = money;
		this.hid = hid;
		this.states = states;
		Orderstime = orderstime;
		this.checkouttime = checkouttime;
		this.price = price;
	}

	public int getHoid() {
		return hoid;
	}
	public void setHoid(int hoid) {
		this.hoid = hoid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getChecktime() {
		return checktime;
	}
	public void setChecktime(Date checktime) {
		this.checktime = checktime;
	}
	public Date getLeavetime() {
		return leavetime;
	}
	public void setLeavetime(Date leavetime) {
		this.leavetime = leavetime;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public int getStates() {
		return states;
	}
	public void setStates(int states) {
		this.states = states;
	}
	public Date getOrderstime() {
		return Orderstime;
	}
	public void setOrderstime(Date orderstime) {
		Orderstime = orderstime;
	}
	public Date getCheckouttime() {
		return checkouttime;
	}
	public void setCheckouttime(Date checkouttime) {
		this.checkouttime = checkouttime;
	}
	@Override
	public String toString() {
		return "Hostorder [hoid=" + hoid + ", cid=" + cid + ", checktime=" + checktime + ", leavetime=" + leavetime
				+ ", money=" + money + ", hid=" + hid + ", states=" + states + ", Orderstime=" + Orderstime
				+ ", checkouttime=" + checkouttime + "]";
	}
	
	

}
