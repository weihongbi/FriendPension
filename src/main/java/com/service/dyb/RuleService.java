package com.service.dyb;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.RuleDao;
import com.entity.Rule;

@Service
public class RuleService {
	@Resource
	RuleDao dao;
	public Integer add(Rule r) {
		return dao.add(r);
	}
	
	public Integer getById() {
		return dao.getByid();
	}
}
