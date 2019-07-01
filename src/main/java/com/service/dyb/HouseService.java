package com.service.dyb;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.HouseDao;
import com.entity.House;

@Service
public class HouseService {
	
	@Resource
	HouseDao dao;
	
	
	public Integer add(House h) {
		return dao.add(h);
	}
	
	public Integer getById() {
		return dao.getById();
	}
	
	public Integer updateMating(String matingId,Integer hid) {
		return dao.updateMating(matingId, hid);
	}
	
	public Integer updateHouse(Integer hpid,Integer ruleid,Integer pruleId,Integer rule,Integer hid) {
		return dao.updateHouse(hpid, ruleid, pruleId, rule, hid);
	}
}
