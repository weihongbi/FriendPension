package com.entity;

public class Toilettype {
	private int toiletTypeId;
	private String toiletTypeName;
	
	public Toilettype() {
		super();
	}
	
	public Toilettype(int toiletTypeId, String toiletTypeName) {
		super();
		this.toiletTypeId = toiletTypeId;
		this.toiletTypeName = toiletTypeName;
	}

	public int getToiletTypeId() {
		return toiletTypeId;
	}
	public void setToiletTypeId(int toiletTypeId) {
		this.toiletTypeId = toiletTypeId;
	}
	public String getToiletTypeName() {
		return toiletTypeName;
	}
	public void setToiletTypeName(String toiletTypeName) {
		this.toiletTypeName = toiletTypeName;
	}
	@Override
	public String toString() {
		return "toilettype [toiletTypeId=" + toiletTypeId + ", toiletTypeName=" + toiletTypeName + "]";
	}
}
