package com.controller.whb;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Audit;
import com.google.gson.Gson;
import com.service.whb.AuditService;

@Controller
@RequestMapping("auditw")
public class AuditController {
	@Resource
	AuditService service;
	@RequestMapping("queryAuditw")
	@ResponseBody
	public String queryAuditw(Integer hid) {
		Gson g = new Gson();
		return g.toJson(service.queryaudit(hid));
	}
	@RequestMapping("add")
	@ResponseBody
	public String add(Audit a) {
		service.add(a);
		return "1";
	}
}
