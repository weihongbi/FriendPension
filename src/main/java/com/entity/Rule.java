package com.entity;

public class Rule {
	private int ruleid;
	private String deal;
	private String renege;
	private String rule;
	private int minday;
	private int maxday;
	private int reception;
	private String otherRequire;
	private String hoideTips;
	public Rule() {
		super();
	}
	public Rule(int ruleid, String deal, String renege, String rule, int minday, int maxday, int reception,
			String otherRequire, String hoideTips) {
		super();
		this.ruleid = ruleid;
		this.deal = deal;
		this.renege = renege;
		this.rule = rule;
		this.minday = minday;
		this.maxday = maxday;
		this.reception = reception;
		this.otherRequire = otherRequire;
		this.hoideTips = hoideTips;
	}
	public int getRuleid() {
		return ruleid;
	}
	public void setRuleid(int ruleid) {
		this.ruleid = ruleid;
	}
	public String getDeal() {
		return deal;
	}
	public void setDeal(String deal) {
		this.deal = deal;
	}
	public String getRenege() {
		return renege;
	}
	public void setRenege(String renege) {
		this.renege = renege;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	public int getMinday() {
		return minday;
	}
	public void setMinday(int minday) {
		this.minday = minday;
	}
	public int getMaxday() {
		return maxday;
	}
	public void setMaxday(int maxday) {
		this.maxday = maxday;
	}
	public int getReception() {
		return reception;
	}
	public void setReception(int reception) {
		this.reception = reception;
	}
	public String getOtherRequire() {
		return otherRequire;
	}
	public void setOtherRequire(String otherRequire) {
		this.otherRequire = otherRequire;
	}
	public String getHoideTips() {
		return hoideTips;
	}
	public void setHoideTips(String hoideTips) {
		this.hoideTips = hoideTips;
	}
	@Override
	public String toString() {
		return "Rule [ruleid=" + ruleid + ", deal=" + deal + ", renege=" + renege + ", rule=" + rule + ", minday="
				+ minday + ", maxday=" + maxday + ", reception=" + reception + ", otherRequire=" + otherRequire
				+ ", hoideTips=" + hoideTips + "]";
	}
	
	

}
