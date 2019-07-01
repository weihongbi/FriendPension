package com.service.dyb;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.PriceRuleDao;
import com.entity.Pricerule;

@Service
public class PriceRuleService {
	@Resource
	PriceRuleDao dao;
	public Integer add(Pricerule p) {
		return dao.add(p);
	}
	
	public Integer getById() {
		return dao.getById();
	}
}
