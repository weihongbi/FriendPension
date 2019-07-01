package com.service.dyb;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.ApartmentsDao;
import com.entity.Apartments;

@Service
public class ApartmentService {
	@Resource
	ApartmentsDao dao;
	public Integer add(Apartments a) {
		return dao.add(a);
	}
	
	
	public Integer getByid() {
		return dao.getById();
	}
}
