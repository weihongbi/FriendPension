package com.controller.dyb;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Rule;
import com.service.dyb.RuleServiceD;

@RestController
@RequestMapping(value="rule")
public class RuleControllerD {
	@Resource
	RuleServiceD rs;
	@RequestMapping(value="add")
	public Integer add(Rule r) {
		System.out.println(r);
		return rs.add(r);
	}
}
