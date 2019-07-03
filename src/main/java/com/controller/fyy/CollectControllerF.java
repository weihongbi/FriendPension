package com.controller.fyy;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.fyy.CollectServiceF;

@Controller
@RequestMapping("collect")
public class CollectControllerF {
	@Resource
	CollectServiceF coservice;
	
	@RequestMapping("querycollect")
	public String querycollect(Model m,int cid){
		m.addAttribute("colist", coservice.querycollect(cid));
		return "front/collect";
	}
	
	@RequestMapping("delcollect")
	public String delcollect(int collectid){
		coservice.delcollect(collectid);
		return "redirect:querycollect?cid=1";
	}
	
	
}
