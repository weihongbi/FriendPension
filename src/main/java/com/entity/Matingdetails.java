package com.entity;

public class Matingdetails {
	private int mdId;
	private String matingDetails;
	private int matingId;
	public Matingdetails() {
		super();
	}
	public Matingdetails(int mdId, String matingDetails, int matingId) {
		super();
		this.mdId = mdId;
		this.matingDetails = matingDetails;
		this.matingId = matingId;
	}
	public int getMdId() {
		return mdId;
	}
	public void setMdId(int mdId) {
		this.mdId = mdId;
	}
	public String getMatingDetails() {
		return matingDetails;
	}
	public void setMatingDetails(String matingDetails) {
		this.matingDetails = matingDetails;
	}
	public int getMatingId() {
		return matingId;
	}
	public void setMatingId(int matingId) {
		this.matingId = matingId;
	}
	@Override
	public String toString() {
		return "Matingdetails [mdId=" + mdId + ", matingDetails=" + matingDetails + ", matingId=" + matingId + "]";
	}
	
	

}
