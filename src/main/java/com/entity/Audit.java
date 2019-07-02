package com.entity;

import java.util.Date;

public class Audit {
	private Integer aid;
	private Integer hid;
	private Integer cid;
	private Date optime;
	private String res;
	public Audit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Audit(Integer aid, Integer hid, Integer cid, Date optime, String res) {
		super();
		this.aid = aid;
		this.hid = hid;
		this.cid = cid;
		this.optime = optime;
		this.res = res;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Date getOptime() {
		return optime;
	}
	public void setOptime(Date optime) {
		this.optime = optime;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	@Override
	public String toString() {
		return "Audit [aid=" + aid + ", hid=" + hid + ", cid=" + cid + ", optime=" + optime + ", res=" + res + "]";
	}
	
}
