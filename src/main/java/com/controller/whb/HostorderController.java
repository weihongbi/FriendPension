package com.controller.whb;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.service.whb.HostorderService;

@Controller
@RequestMapping("hostorder")
public class HostorderController {
	@Resource
	HostorderService service;
	@RequestMapping("queryO")
	@ResponseBody
	public String queryO() {
		Gson g = new Gson();
		return g.toJson(service.queryO());
	}
}
