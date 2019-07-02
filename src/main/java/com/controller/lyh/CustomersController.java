package com.controller.lyh;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Pages;
import com.entity.Customers;
import com.service.lyh.CustomersService;



@Controller
public class CustomersController {
	@Resource
	CustomersService service;
	
	@RequestMapping(value="topageCus")
	public String topageCus(){
		return "back/Customerslist";
	}
	
	@RequestMapping(value="CusQuery")
	@ResponseBody
	public List<Customers> query(){
		return service.query();
	}
	
	
	@RequestMapping(value="CusQueryPage")
	@ResponseBody
	public Pages CusQueryPage(Integer page,Integer rows){
		return service.queryPage(page, rows);
	}
	
}
