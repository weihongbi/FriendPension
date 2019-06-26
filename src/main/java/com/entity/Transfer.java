package com.entity;

import java.sql.Date;

public class Transfer {
	private int tid;
	private int empid;
	private Date operationtime;
	private int totalmoney;
	private String extractrate;
	private int totalprice;
	private int hostmoney;
	private int cid;
	private int states;
	public Transfer() {
		super();
	}
	public Transfer(int tid, int empid, Date operationtime, int totalmoney, String extractrate, int totalprice,
			int hostmoney, int cid, int states) {
		super();
		this.tid = tid;
		this.empid = empid;
		this.operationtime = operationtime;
		this.totalmoney = totalmoney;
		this.extractrate = extractrate;
		this.totalprice = totalprice;
		this.hostmoney = hostmoney;
		this.cid = cid;
		this.states = states;
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
	public int getTotalmoney() {
		return totalmoney;
	}
	public void setTotalmoney(int totalmoney) {
		this.totalmoney = totalmoney;
	}
	public String getExtractrate() {
		return extractrate;
	}
	public void setExtractrate(String extractrate) {
		this.extractrate = extractrate;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public int getHostmoney() {
		return hostmoney;
	}
	public void setHostmoney(int hostmoney) {
		this.hostmoney = hostmoney;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getStates() {
		return states;
	}
	public void setStates(int states) {
		this.states = states;
	}
	@Override
	public String toString() {
		return "Transfer [tid=" + tid + ", empid=" + empid + ", operationtime=" + operationtime + ", totalmoney="
				+ totalmoney + ", extractrate=" + extractrate + ", totalprice=" + totalprice + ", hostmoney="
				+ hostmoney + ", cid=" + cid + ", states=" + states + "]";
	}
	
	

}
