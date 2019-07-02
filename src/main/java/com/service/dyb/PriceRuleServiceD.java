package com.service.dyb;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.PriceRuleDaoD;
import com.entity.Pricerule;

@Service
public class PriceRuleServiceD {
	@Resource
	PriceRuleDaoD dao;
	public Integer add(Pricerule p) {
		return dao.add(p);
	}
	
	public Integer getById() {
		return dao.getById();
	}
}
