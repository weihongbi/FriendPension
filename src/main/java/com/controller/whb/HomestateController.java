package com.controller.whb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Homestate;
import com.google.gson.Gson;
import com.service.whb.HomestateService;

@Controller
@RequestMapping("homesate")
public class HomestateController {
	@Resource
	HomestateService service;
	@RequestMapping("find")
	@ResponseBody
	public String find(String yutime,String leavetime,Integer hid,Integer cid) {
		List<Homestate> find = service.find(yutime, hid);
		if(find.size()==0) {
			service.addHome(yutime, leavetime, hid, cid);
			return "1";
		}else {
			Gson g = new Gson();
			return g.toJson(find.get(0));
		}
		
	}
}
