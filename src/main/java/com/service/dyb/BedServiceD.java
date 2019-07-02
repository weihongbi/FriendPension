package com.service.dyb;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.dao.dyb.BedDaoD;
import com.entity.Bed;
import com.entity.Bedtype;

@Service
public class BedServiceD {
	@Resource
	BedDaoD dao;
	
	public List<Map<String,Object>> queryAll(){
		return dao.queryAll();
	}
	
	
	public List<Bedtype> findAll(){
		return dao.findAll();
	}
	
	
	public Integer add(Bed b) {
		return dao.add(b);
	}
	public Integer getByid() {
		return dao.getById();
	}
}
