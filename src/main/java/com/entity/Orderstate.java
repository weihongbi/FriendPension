package com.entity;

public class Orderstate {
	private int oid;
	private String oname;
	public Orderstate() {
		super();
	}
	public Orderstate(int oid, String oname) {
		super();
		this.oid = oid;
		this.oname = oname;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	@Override
	public String toString() {
		return "Orderstate [oid=" + oid + ", oname=" + oname + "]";
	}
	
	
	
}
