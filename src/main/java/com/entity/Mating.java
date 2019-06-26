package com.entity;

public class Mating {
	private int matingId;
	private String matingName;
	public Mating() {
		super();
	}
	public Mating(int matingId, String matingName) {
		super();
		this.matingId = matingId;
		this.matingName = matingName;
	}
	public int getMatingId() {
		return matingId;
	}
	public void setMatingId(int matingId) {
		this.matingId = matingId;
	}
	public String getMatingName() {
		return matingName;
	}
	public void setMatingName(String matingName) {
		this.matingName = matingName;
	}
	@Override
	public String toString() {
		return "Mating [matingId=" + matingId + ", matingName=" + matingName + "]";
	}
	
}
