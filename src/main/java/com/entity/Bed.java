package com.entity;

public class Bed {
	private int bedid;
	private int bedTypeId;
	private double longs;
	private double width;
	private int alike;
	
	public Bed() {
		super();
	}

	public Bed(int bedid, int bedTypeId, double longs, double width, int alike) {
		super();
		this.bedid = bedid;
		this.bedTypeId = bedTypeId;
		this.longs = longs;
		this.width = width;
		this.alike = alike;
	}

	public int getBedid() {
		return bedid;
	}

	public void setBedid(int bedid) {
		this.bedid = bedid;
	}

	public int getBedTypeId() {
		return bedTypeId;
	}

	public void setBedTypeId(int bedTypeId) {
		this.bedTypeId = bedTypeId;
	}

	public double getLongs() {
		return longs;
	}

	public void setLongs(double longs) {
		this.longs = longs;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public int getAlike() {
		return alike;
	}

	public void setAlike(int alike) {
		this.alike = alike;
	}

	@Override
	public String toString() {
		return "Bed [bedid=" + bedid + ", bedTypeId=" + bedTypeId + ", longs=" + longs + ", width=" + width + ", alike="
				+ alike + "]";
	}
	
	
	
	
}
