package com.controller.whb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Homestate;
import com.service.whb.HomestateService;

@Controller
@RequestMapping("homesate")
public class HomestateController {
	@Resource
	HomestateService service;
	@RequestMapping("find")
	@ResponseBody
	public String find(Integer hid) {
		List<Homestate> find = service.find(hid);
		if(find.size()==0) {
			//service.addHome(h);
			return "1";
		}else {
			return "0";
		}
		
	}
}
