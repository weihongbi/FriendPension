package com.controller.lyh;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Bedtype;
import com.service.lyh.bedTypeService;


@Controller
@RequestMapping(value="bedtype")
public class bedTypeController {
	@Resource
	bedTypeService service;
	
	@RequestMapping(value="topageBedType")
	public String topageBedType(){
		return "back/bedTypelist";
	}
	
	
	@RequestMapping(value="bedTypequery")
	@ResponseBody
	public List<Bedtype> bedTypequery(){
		return service.query();
	}
	
	@RequestMapping(value="add")
	@ResponseBody
	public Integer add(Bedtype b){
		return service.add(b);
	}
	
	
	@RequestMapping(value="update")
	@ResponseBody
	public Integer update(Bedtype b){
		System.out.println(b);
		return service.update(b);
	}
	
	@RequestMapping(value="del")
	@ResponseBody
	public Integer del(Integer bedTypeid){
		System.out.println(bedTypeid);
		return service.del(bedTypeid);
	}
}
