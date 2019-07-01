package com.controller.lyh;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.lyh.houseService;
import com.service.lyh.rentService;

@Controller
public class houseController {
	@Resource
	houseService service;
	
	@Resource
	rentService service2;
	
	@RequestMapping("queryHouse")
	public String queryHouse(Model m){
		m.addAttribute("listHouse", service.queryAll());
		System.out.println(service.queryAll());
		return "/front/duanzufang";
	}
	@RequestMapping("queryhouseType")
	public String queryhouseType(Model m) {
		m.addAttribute("listhouseType", service.queryhouseType());
		return "/front/duanzufang";
	}
	
	@RequestMapping("query2")
	public String query2(String city,String houseTypeName,String rentName,Integer livablePeople,Integer pageNum,Model m) {
		  m.addAttribute("listHouse", service.queryAll()); 
		  m.addAttribute("list2",service.query2(city, houseTypeName, rentName,livablePeople,pageNum));
		  m.addAttribute("pageNum", pageNum);
		  m.addAttribute("listhouseType", service.queryhouseType());
		  m.addAttribute("listRent", service2.query());
		  
		  Integer count = service.Count(city, houseTypeName, rentName, livablePeople);
		  Integer totalPages=0;
		  if(count % 2==0) {
			  totalPages=count /2;
		  }else {
			  totalPages =(count/2)+1;
		  }
		  m.addAttribute("count",totalPages);
		  
		  return "/front/duanzufang";
	}
	
	
	
}
