package com.entity;

public class Zhuanmoney {
	private Integer zid;
	private Integer hoid;
	private String extractrate;
	private Integer pingprice;
	private Integer dongprice;
	
	public Zhuanmoney() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Zhuanmoney(Integer zid, Integer hoid, String extractrate, Integer pingprice, Integer dongprice) {
		super();
		this.zid = zid;
		this.hoid = hoid;
		this.extractrate = extractrate;
		this.pingprice = pingprice;
		this.dongprice = dongprice;
	}

	public Integer getZid() {
		return zid;
	}

	public void setZid(Integer zid) {
		this.zid = zid;
	}

	public Integer getHoid() {
		return hoid;
	}

	public void setHoid(Integer hoid) {
		this.hoid = hoid;
	}

	public String getExtractrate() {
		return extractrate;
	}

	public void setExtractrate(String extractrate) {
		this.extractrate = extractrate;
	}

	public Integer getPingprice() {
		return pingprice;
	}

	public void setPingprice(Integer pingprice) {
		this.pingprice = pingprice;
	}

	public Integer getDongprice() {
		return dongprice;
	}

	public void setDongprice(Integer dongprice) {
		this.dongprice = dongprice;
	}

	@Override
	public String toString() {
		return "Zhuanmoney [zid=" + zid + ", hoid=" + hoid + ", extractrate=" + extractrate + ", pingprice=" + pingprice
				+ ", dongprice=" + dongprice + "]";
	}
	
}
