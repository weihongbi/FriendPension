package com.controller.whb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Hostorder;
import com.entity.Transfer;
import com.google.gson.Gson;
import com.service.whb.HostorderService;
import com.service.whb.TransferService;

@Controller
@RequestMapping("transfer")
public class TransferController {
	@Resource
	TransferService service;
	@Resource
	HostorderService serviceo;
	@RequestMapping("queryAll")
	@ResponseBody
	public String queryAll() {
		Gson g = new Gson();
		return g.toJson(service.queryAll());
	}
	@RequestMapping("add")
	@ResponseBody
	public String add(Transfer t,Integer hoid,Integer hid) {
		List<Transfer> list = service.query(hid);			
		t.setCid(list.get(0).getCid());
		service.add(t);
		serviceo.update(hoid);
		return "1";	
	}
}
