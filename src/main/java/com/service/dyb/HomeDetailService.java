package com.service.dyb;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.HomeDetailsDao;
import com.entity.Homedetails;

@Service
public class HomeDetailService {
	@Resource
	HomeDetailsDao dao;
	
	
	public Integer add(Homedetails hd) {
		return dao.add(hd);
	}
	
	public Integer getById() {
		return dao.getById();
	}
}
