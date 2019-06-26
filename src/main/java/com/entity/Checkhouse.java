package com.entity;

import java.sql.Date;

public class Checkhouse {
	private int tid;
	private int empid;
	private Date operationtime;
	private Date checkouttime;
	private int terrace;
	private int landlord;
	private int tenant;
	public Checkhouse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Checkhouse(int tid, int empid, Date operationtime, Date checkouttime, int terrace, int landlord,
			int tenant) {
		super();
		this.tid = tid;
		this.empid = empid;
		this.operationtime = operationtime;
		this.checkouttime = checkouttime;
		this.terrace = terrace;
		this.landlord = landlord;
		this.tenant = tenant;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public Date getOperationtime() {
		return operationtime;
	}
	public void setOperationtime(Date operationtime) {
		this.operationtime = operationtime;
	}
	public Date getCheckouttime() {
		return checkouttime;
	}
	public void setCheckouttime(Date checkouttime) {
		this.checkouttime = checkouttime;
	}
	public int getTerrace() {
		return terrace;
	}
	public void setTerrace(int terrace) {
		this.terrace = terrace;
	}
	public int getLandlord() {
		return landlord;
	}
	public void setLandlord(int landlord) {
		this.landlord = landlord;
	}
	public int getTenant() {
		return tenant;
	}
	public void setTenant(int tenant) {
		this.tenant = tenant;
	}
	@Override
	public String toString() {
		return "Checkhouse [tid=" + tid + ", empid=" + empid + ", operationtime=" + operationtime + ", checkouttime="
				+ checkouttime + ", terrace=" + terrace + ", landlord=" + landlord + ", tenant=" + tenant + "]";
	}
	
	

}
