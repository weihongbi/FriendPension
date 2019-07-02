package com.service.dyb;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.ApartmentsDaoD;
import com.entity.Apartments;

@Service
public class ApartmentServiceD {
	@Resource
	ApartmentsDaoD dao;
	public Integer add(Apartments a) {
		return dao.add(a);
	}
	
	
	public Integer getByid() {
		return dao.getById();
	}
}
