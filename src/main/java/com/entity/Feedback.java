package com.entity;

import java.sql.Date;

public class Feedback {
	private int fid;
	private int cid;
	private String fcontext;
	private int hid;
	private int empid;
	private Date disposetime;
	private String result;
	public Feedback() {
		super();
	}
	public Feedback(int fid, int cid, String fcontext, int hid, int empid, Date disposetime, String result) {
		super();
		this.fid = fid;
		this.cid = cid;
		this.fcontext = fcontext;
		this.hid = hid;
		this.empid = empid;
		this.disposetime = disposetime;
		this.result = result;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFcontext() {
		return fcontext;
	}
	public void setFcontext(String fcontext) {
		this.fcontext = fcontext;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public Date getDisposetime() {
		return disposetime;
	}
	public void setDisposetime(Date disposetime) {
		this.disposetime = disposetime;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Feedback [fid=" + fid + ", cid=" + cid + ", fcontext=" + fcontext + ", hid=" + hid + ", empid=" + empid
				+ ", disposetime=" + disposetime + ", result=" + result + "]";
	}
	
	


}
