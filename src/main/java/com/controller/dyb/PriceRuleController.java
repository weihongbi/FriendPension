package com.controller.dyb;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Pricerule;
import com.service.dyb.PriceRuleService;

@RestController
@RequestMapping(value="priceRule")
public class PriceRuleController {
	@Resource
	PriceRuleService ps;
	
	@RequestMapping(value="add")
	public Integer add(Pricerule p) {
		System.out.println(p);
		return ps.add(p);
	}
}
