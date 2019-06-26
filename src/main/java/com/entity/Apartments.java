package com.entity;

public class Apartments {
	private int Apartmentsid;
	private int parlor;
	private int toilet;
	private int cookhouse;
	private int balcony;
	public Apartments() {
		super();
	}
	public Apartments(int apartmentsid, int parlor, int toilet, int cookhouse, int balcony) {
		super();
		Apartmentsid = apartmentsid;
		this.parlor = parlor;
		this.toilet = toilet;
		this.cookhouse = cookhouse;
		this.balcony = balcony;
	}
	public int getApartmentsid() {
		return Apartmentsid;
	}
	public void setApartmentsid(int apartmentsid) {
		Apartmentsid = apartmentsid;
	}
	public int getParlor() {
		return parlor;
	}
	public void setParlor(int parlor) {
		this.parlor = parlor;
	}
	public int getToilet() {
		return toilet;
	}
	public void setToilet(int toilet) {
		this.toilet = toilet;
	}
	public int getCookhouse() {
		return cookhouse;
	}
	public void setCookhouse(int cookhouse) {
		this.cookhouse = cookhouse;
	}
	public int getBalcony() {
		return balcony;
	}
	public void setBalcony(int balcony) {
		this.balcony = balcony;
	}
	@Override
	public String toString() {
		return "Apartments [Apartmentsid=" + Apartmentsid + ", parlor=" + parlor + ", toilet=" + toilet + ", cookhouse="
				+ cookhouse + ", balcony=" + balcony + "]";
	}
	
	
	

}
