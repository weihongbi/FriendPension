package com.entity;

public class Collect {
	private int collectid;
	private int cid;
	private int hid;
	public Collect() {
		super();
	}
	public Collect(int collectid, int cid, int hid) {
		super();
		this.collectid = collectid;
		this.cid = cid;
		this.hid = hid;
	}
	public int getCollectid() {
		return collectid;
	}
	public void setCollectid(int collectid) {
		this.collectid = collectid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	@Override
	public String toString() {
		return "Collect [collectid=" + collectid + ", cid=" + cid + ", hid=" + hid + "]";
	}
	
}
