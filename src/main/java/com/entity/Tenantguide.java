package com.entity;

public class Tenantguide {
	private int tid;
	private String ttitle;
	private String tcontext;
	public Tenantguide() {
		super();
	}
	public Tenantguide(int tid, String ttitle, String tcontext) {
		super();
		this.tid = tid;
		this.ttitle = ttitle;
		this.tcontext = tcontext;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTtitle() {
		return ttitle;
	}
	public void setTtitle(String ttitle) {
		this.ttitle = ttitle;
	}
	public String getTcontext() {
		return tcontext;
	}
	public void setTcontext(String tcontext) {
		this.tcontext = tcontext;
	}
	@Override
	public String toString() {
		return "Tenantguide [tid=" + tid + ", ttitle=" + ttitle + ", tcontext=" + tcontext + "]";
	}
	
}
