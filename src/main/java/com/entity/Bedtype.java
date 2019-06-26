package com.entity;

public class Bedtype {
	private int bedTypeId;
	private String bedTypeName;
	public Bedtype() {
		super();
	}
	public Bedtype(int bedTypeId, String bedTypeName) {
		super();
		this.bedTypeId = bedTypeId;
		this.bedTypeName = bedTypeName;
	}
	public int getBedTypeId() {
		return bedTypeId;
	}
	public void setBedTypeId(int bedTypeId) {
		this.bedTypeId = bedTypeId;
	}
	public String getBedTypeName() {
		return bedTypeName;
	}
	public void setBedTypeName(String bedTypeName) {
		this.bedTypeName = bedTypeName;
	}
	@Override
	public String toString() {
		return "Bedtype [bedTypeId=" + bedTypeId + ", bedTypeName=" + bedTypeName + "]";
	}
	
	

}
