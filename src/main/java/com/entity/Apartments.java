package com.entity;

public class Apartments {
	private int Apartmentsid;
	private int bedroom;
	private int parlor;
	private int toilet;
	private int cookhouse;
	private int balcony;
	public Apartments() {
		super();
	}
	
	public int getBedroom() {
		return bedroom;
	}

	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
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
		return "Apartments [Apartmentsid=" + Apartmentsid + ", bedroom=" + bedroom + ", parlor=" + parlor + ", toilet="
				+ toilet + ", cookhouse=" + cookhouse + ", balcony=" + balcony + "]";
	}
	
	
	

}
