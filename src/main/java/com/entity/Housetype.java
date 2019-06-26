package com.entity;

public class Housetype {
	private int houseTypeId;
	private String houseTypeName;
	
	public Housetype() {
		super();
	}
	
	public Housetype(int houseTypeId, String houseTypeName) {
		super();
		this.houseTypeId = houseTypeId;
		this.houseTypeName = houseTypeName;
	}

	public int getHouseTypeId() {
		return houseTypeId;
	}
	public void setHouseTypeId(int houseTypeId) {
		this.houseTypeId = houseTypeId;
	}
	public String getHouseTypeName() {
		return houseTypeName;
	}
	public void setHouseTypeName(String houseTypeName) {
		this.houseTypeName = houseTypeName;
	}
	@Override
	public String toString() {
		return "housetype [houseTypeId=" + houseTypeId + ", houseTypeName=" + houseTypeName + "]";
	}
}
