package com.entity;

import java.sql.Date;

public class Evaluate {
	private int eid;
	private int hid;
	private String cname;
	private Date checktime;
	private String econtext;
	private String replycontext;
	public Evaluate() {
		super();
	}
	public Evaluate(int eid, int hid, String cname, Date checktime, String econtext, String replycontext) {
		super();
		this.eid = eid;
		this.hid = hid;
		this.cname = cname;
		this.checktime = checktime;
		this.econtext = econtext;
		this.replycontext = replycontext;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Date getChecktime() {
		return checktime;
	}
	public void setChecktime(Date checktime) {
		this.checktime = checktime;
	}
	public String getEcontext() {
		return econtext;
	}
	public void setEcontext(String econtext) {
		this.econtext = econtext;
	}
	public String getReplycontext() {
		return replycontext;
	}
	public void setReplycontext(String replycontext) {
		this.replycontext = replycontext;
	}
	@Override
	public String toString() {
		return "Evaluate [eid=" + eid + ", hid=" + hid + ", cname=" + cname + ", checktime=" + checktime + ", econtext="
				+ econtext + ", replycontext=" + replycontext + "]";
	}
	

}
