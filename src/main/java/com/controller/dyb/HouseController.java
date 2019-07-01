package com.controller.dyb;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.House;
import com.service.dyb.HomeDetailService;
import com.service.dyb.HomephotoService;
import com.service.dyb.HouseService;
import com.service.dyb.PriceRuleService;
import com.service.dyb.RuleService;

@RestController
@RequestMapping(value="house")
public class HouseController {
	@Resource
	HouseService hs;
	@Resource
	HomeDetailService hds;
	
	@Resource
	HomephotoService hps;
	@Resource
	RuleService rs;
	@Resource
	PriceRuleService prs;
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
