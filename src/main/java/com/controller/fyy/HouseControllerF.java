package com.controller.fyy;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.fyy.HouseServiceF;

@Controller
@RequestMapping("house")
public class HouseControllerF {
	@Resource
	HouseServiceF hservice;
	
	//后台查询房源
	@RequestMapping("housequery")
	@ResponseBody
	public List<Map<String,Object>> housequery(){
		return hservice.queryhouse();
	}
	
	//前台查询房源
	@RequestMapping("housequery2")
	public String housequery2(Model m){
		m.addAttribute("list",hservice.queryhouse());
		
		  List<Map<String, Object>> queryhouse = hservice.queryhouse();
		  System.out.println(queryhouse);
		 
		return "front/index";
	}
	
	
}
