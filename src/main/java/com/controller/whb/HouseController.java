package com.controller.whb;

import javax.annotation.Resource;
import javax.print.attribute.standard.Severity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.service.whb.HouseService;

@Controller
@RequestMapping("housew")
public class HouseController {
	@Resource
	HouseService service;
	
	@RequestMapping("queryHouse")
	@ResponseBody
	public String queryHouse() {
		Gson g = new Gson();
		return g.toJson(service.query());
	}
	@RequestMapping("queryPhoto")
	@ResponseBody
	public String queryPhoto(Integer hpid) {
		Gson g = new Gson();
		return g.toJson(service.queryPhoto(hpid));
	}
	@RequestMapping("upStates")
	@ResponseBody
	public String upStates(Integer hid) {
		service.uphouse(hid);
		return "1";
	}
	
}
