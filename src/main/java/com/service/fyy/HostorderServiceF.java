package com.service.fyy;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.fyy.HostorderDaoF;
import com.entity.Hostorder;

@Service
public class HostorderServiceF implements HostorderDaoF {

	@Resource
	HostorderDaoF dao;
	
	public List<Map<String, Object>> queryhorder() {
		return dao.queryhorder();
	}


	public int delhorder(int hoid) {
		return dao.delhorder(hoid);
	}

	public int upstates(Integer hoid) {
		return dao.upstates(hoid);
	}
	
	public List<Map<String, Object>> querystates(Integer oid) {
		return dao.querystates(oid);
	}


	public List<Map<String, Object>> queryByhoid(Integer hoid) {
		return dao.queryByhoid(hoid);
	}


	

}
