package com.entity;

public class Homedetails {
	private int homedid;
	private int provinceId;
	private int cityid;
	private int areaid;
	private int houseTypeId;
	private int rentid;
	private int Apartmentsid;
	private int rentarea;
	private int toiletTypeId;
	private int bedid;
	private int livablePeople;
	private int together;
	private int identicalHouse;
	public Homedetails() {
		super();
	}
	public Homedetails(int homedid, int provinceId, int cityid, int areaid, int houseTypeId, int rentid,
			int apartmentsid, int rentarea, int toiletTypeId, int bedid, int livablePeople, int together,
			int identicalHouse) {
		super();
		this.homedid = homedid;
		this.provinceId = provinceId;
		this.cityid = cityid;
		this.areaid = areaid;
		this.houseTypeId = houseTypeId;
		this.rentid = rentid;
		Apartmentsid = apartmentsid;
		this.rentarea = rentarea;
		this.toiletTypeId = toiletTypeId;
		this.bedid = bedid;
		this.livablePeople = livablePeople;
		this.together = together;
		this.identicalHouse = identicalHouse;
	}
	public int getHomedid() {
		return homedid;
	}
	public void setHomedid(int homedid) {
		this.homedid = homedid;
	}
	public int getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public int getAreaid() {
		return areaid;
	}
	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}
	public int getHouseTypeId() {
		return houseTypeId;
	}
	public void setHouseTypeId(int houseTypeId) {
		this.houseTypeId = houseTypeId;
	}
	public int getRentid() {
		return rentid;
	}
	public void setRentid(int rentid) {
		this.rentid = rentid;
	}
	public int getApartmentsid() {
		return Apartmentsid;
	}
	public void setApartmentsid(int apartmentsid) {
		Apartmentsid = apartmentsid;
	}
	public int getRentarea() {
		return rentarea;
	}
	public void setRentarea(int rentarea) {
		this.rentarea = rentarea;
	}
	public int getToiletTypeId() {
		return toiletTypeId;
	}
	public void setToiletTypeId(int toiletTypeId) {
		this.toiletTypeId = toiletTypeId;
	}
	public int getBedid() {
		return bedid;
	}
	public void setBedid(int bedid) {
		this.bedid = bedid;
	}
	public int getLivablePeople() {
		return livablePeople;
	}
	public void setLivablePeople(int livablePeople) {
		this.livablePeople = livablePeople;
	}
	public int getTogether() {
		return together;
	}
	public void setTogether(int together) {
		this.together = together;
	}
	public int getIdenticalHouse() {
		return identicalHouse;
	}
	public void setIdenticalHouse(int identicalHouse) {
		this.identicalHouse = identicalHouse;
	}
	@Override
	public String toString() {
		return "Homedetails [homedid=" + homedid + ", provinceId=" + provinceId + ", cityid=" + cityid + ", areaid="
				+ areaid + ", houseTypeId=" + houseTypeId + ", rentid=" + rentid + ", Apartmentsid=" + Apartmentsid
				+ ", rentarea=" + rentarea + ", toiletTypeId=" + toiletTypeId + ", bedid=" + bedid + ", livablePeople="
				+ livablePeople + ", together=" + together + ", identicalHouse=" + identicalHouse + "]";
	}
	
	
}
