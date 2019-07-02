package com.controller.lyh;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Rent;
import com.service.lyh.rentService;


@Controller
public class rentController {
	@Resource
	rentService service;
	
	@RequestMapping(value="topageRent")
	public String topageRent(){
		return "back/rentlist";
	}
	
	
	@RequestMapping(value="rentquery")
	@ResponseBody
	public List<Rent> rentquery(){
		System.out.println(service.query());
		return service.query();
	}
	
	@RequestMapping(value="add")
	@ResponseBody
	public Integer add(Rent r){
		return service.add(r);
	}
	
	
	@RequestMapping(value="update")
	@ResponseBody
	public Integer update(Rent r){
		return service.update(r);
	}
	
	@RequestMapping(value="del")
	@ResponseBody
	public Integer del(Integer rentid){
		return service.del(rentid);
	}
}
