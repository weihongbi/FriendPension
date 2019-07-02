package com.controller.dyb;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.House;

import com.service.dyb.HomeDetailServiceD;

import com.service.dyb.HomephotoServiceD;

import com.service.dyb.HousesServiceD;

import com.service.dyb.PriceRuleServiceD;

import com.service.dyb.RuleServiceD;

@RestController
@RequestMapping(value="house")
public class HousesControllerD {
	@Resource
	HousesServiceD hs;
	@Resource
	HomeDetailServiceD hds;
	
	@Resource
	HomephotoServiceD hps;
	@Resource
	RuleServiceD rs;
	@Resource
	PriceRuleServiceD prs;
	@RequestMapping(value="add")
	public Integer add(House h) {
		System.out.println(h);
		Integer homedid = hds.getById();
		System.out.println(homedid);
		h.setHomedid(homedid);
		return hs.add(h);
	}
	@RequestMapping(value="updateMating")
	public Integer updateMating(String matingId) {
		System.out.println("updateMating");
		System.out.println(matingId);
		Integer hid = hs.getById();
		System.out.println(hid);
		return hs.updateMating(matingId, hid);
	}
	@RequestMapping(value="updateHouse")
	public Integer updateHouse() {
		Integer hpid = hps.getById();
		System.out.println(hpid);
		Integer ruleid = rs.getById();
		System.out.println(ruleid);
		Integer pruleId = prs.getById();
		System.out.println(pruleId);
		Integer hid = hs.getById();
		System.out.println(hid);
		return hs.updateHouse(hpid, pruleId, pruleId, ruleid, hid);
	}
}
