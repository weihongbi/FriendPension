package com.entity;

public class Cities {
	private int id;
	private String cityid;
	private String city;
	private int provinceid;
	public Cities() {
		super();
	}
	public Cities(int id, String cityid, String city, int provinceid) {
		super();
		this.id = id;
		this.cityid = cityid;
		this.city = city;
		this.provinceid = provinceid;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getProvinceid() {
		return provinceid;
	}
	public void setProvinceid(int provinceid) {
		this.provinceid = provinceid;
	}
	@Override
	public String toString() {
		return "cities [id=" + id + ", cityid=" + cityid + ", city=" + city + ", provinceid=" + provinceid + "]";
	}
}
