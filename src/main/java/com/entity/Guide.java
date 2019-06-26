package com.entity;

public class Guide {
	private int gid;
	private int hid;
	private int tid;
	public Guide() {
		super();
	}
	public Guide(int gid, int hid, int tid) {
		super();
		this.gid = gid;
		this.hid = hid;
		this.tid = tid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Guide [gid=" + gid + ", hid=" + hid + ", tid=" + tid + "]";
	}
	

}
