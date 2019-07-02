package com.service.dyb;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.RuleDaoD;
import com.entity.Rule;

@Service
public class RuleServiceD {
	@Resource
	RuleDaoD dao;
	public Integer add(Rule r) {
		return dao.add(r);
	}
	
	public Integer getById() {
		return dao.getByid();
	}
}
