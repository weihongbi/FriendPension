package com.service.dyb;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.HomeDetailsDaoD;
import com.entity.Homedetails;

@Service
public class HomeDetailServiceD {
	@Resource
	HomeDetailsDaoD dao;
	
	
	public Integer add(Homedetails hd) {
		return dao.add(hd);
	}
	
	public Integer getById() {
		return dao.getById();
	}
}
