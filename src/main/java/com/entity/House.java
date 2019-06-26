package com.entity;

public class House {
	private int hid;
	private int homedid;
	private String hname;
	private int hpid;
	private String selfdom;
	private String interior;
	private String traffic;
	private String ambitus;
	private int matingId;
	private int ruleid;
	private int pruleId;
	private String reserveWay;
	private int rule;
	private int state;
	private int cid;
	private int fnum;
	
	
	public House() {
		super();
	}
	
	public House(int hid, int homedid, String hname, int hpid, String selfdom, String interior, String traffic,
			String ambitus, int matingId, int ruleid, int pruleId, String reserveWay, int rule, int state, int cid,
			int fnum) {
		super();
		this.hid = hid;
		this.homedid = homedid;
		this.hname = hname;
		this.hpid = hpid;
		this.selfdom = selfdom;
		this.interior = interior;
		this.traffic = traffic;
		this.ambitus = ambitus;
		this.matingId = matingId;
		this.ruleid = ruleid;
		this.pruleId = pruleId;
		this.reserveWay = reserveWay;
		this.rule = rule;
		this.state = state;
		this.cid = cid;
		this.fnum = fnum;
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public int getHomedid() {
		return homedid;
	}

	public void setHomedid(int homedid) {
		this.homedid = homedid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public int getHpid() {
		return hpid;
	}

	public void setHpid(int hpid) {
		this.hpid = hpid;
	}

	public String getSelfdom() {
		return selfdom;
	}

	public void setSelfdom(String selfdom) {
		this.selfdom = selfdom;
	}

	public String getInterior() {
		return interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public String getTraffic() {
		return traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public String getAmbitus() {
		return ambitus;
	}

	public void setAmbitus(String ambitus) {
		this.ambitus = ambitus;
	}

	public int getMatingId() {
		return matingId;
	}

	public void setMatingId(int matingId) {
		this.matingId = matingId;
	}

	public int getRuleid() {
		return ruleid;
	}

	public void setRuleid(int ruleid) {
		this.ruleid = ruleid;
	}

	public int getPruleId() {
		return pruleId;
	}

	public void setPruleId(int pruleId) {
		this.pruleId = pruleId;
	}

	public String getReserveWay() {
		return reserveWay;
	}

	public void setReserveWay(String reserveWay) {
		this.reserveWay = reserveWay;
	}

	public int getRule() {
		return rule;
	}

	public void setRule(int rule) {
		this.rule = rule;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getFnum() {
		return fnum;
	}

	public void setFnum(int fnum) {
		this.fnum = fnum;
	}

	@Override
	public String toString() {
		return "House [hid=" + hid + ", homedid=" + homedid + ", hname=" + hname + ", hpid=" + hpid + ", selfdom="
				+ selfdom + ", interior=" + interior + ", traffic=" + traffic + ", ambitus=" + ambitus + ", matingId="
				+ matingId + ", ruleid=" + ruleid + ", pruleId=" + pruleId + ", reserveWay=" + reserveWay + ", rule="
				+ rule + ", state=" + state + ", cid=" + cid + ", fnum=" + fnum + "]";
	}

	
}
