package com.entity;

public class Homestate {
	private Integer sid;
	private String checkintime;
	private String leavetime;
	private Integer hid;
	private Integer cid;
	public Homestate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Homestate(Integer sid, String checkintime, String leavetime, Integer hid, Integer cid) {
		super();
		this.sid = sid;
		this.checkintime = checkintime;
		this.leavetime = leavetime;
		this.hid = hid;
		this.cid = cid;
	}

	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getCheckintime() {
		return checkintime;
	}
	public void setCheckintime(String checkintime) {
		this.checkintime = checkintime;
	}
	public String getLeavetime() {
		return leavetime;
	}
	public void setLeavetime(String leavetime) {
		this.leavetime = leavetime;
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

	@Override
	public String toString() {
		return "Homestate [sid=" + sid + ", checkintime=" + checkintime + ", leavetime=" + leavetime + ", hid=" + hid
				+ ", cid=" + cid + "]";
	}
	
}
