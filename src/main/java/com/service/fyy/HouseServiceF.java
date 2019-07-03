package com.service.fyy;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.fyy.HouseDaoF;
@Service
public class HouseServiceF implements HouseDaoF {
	@Resource
	HouseDaoF dao;
	
	public List<Map<String, Object>> queryhouse() {
		return dao.queryhouse();
	}

	public List<Map<String, Object>> queryByhid(int hid) {
		return dao.queryByhid(hid);
	}

}
