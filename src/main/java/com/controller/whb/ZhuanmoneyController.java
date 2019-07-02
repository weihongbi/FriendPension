package com.controller.whb;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Zhuanmoney;
import com.google.gson.Gson;
import com.service.whb.ZhuanmoneyService;

@Controller
@RequestMapping("zhuan")
public class ZhuanmoneyController {
	@Resource
	ZhuanmoneyService service;
	@RequestMapping("add")
	@ResponseBody
	public String add(Zhuanmoney z) {		
		service.add(z);
		return "1";
	}
	@RequestMapping("queryZhuan")
	@ResponseBody
	public String queryZhuan(Integer hoid) {
		Gson g = new Gson();
		return g.toJson(service.queryZhuan(hoid));
	}
}
