package com.entity;

public class Hostguide {
	private int hid;
	private String htitle;
	private String hcontext;
	public Hostguide() {
		super();
	}
	public Hostguide(int hid, String htitle, String hcontext) {
		super();
		this.hid = hid;
		this.htitle = htitle;
		this.hcontext = hcontext;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHtitle() {
		return htitle;
	}
	public void setHtitle(String htitle) {
		this.htitle = htitle;
	}
	public String getHcontext() {
		return hcontext;
	}
	public void setHcontext(String hcontext) {
		this.hcontext = hcontext;
	}
	@Override
	public String toString() {
		return "Hostguide [hid=" + hid + ", htitle=" + htitle + ", hcontext=" + hcontext + "]";
	}
	
	
}
