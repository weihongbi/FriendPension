package com.service.dyb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.dao.dyb.HouseTypeDaoD;
import com.entity.Housetype;

@Service
public class HouseTypeServiceD {
	@Resource
	HouseTypeDaoD dao;
	public List<Housetype> queryAll(){
		return dao.queryAll();
	}
	
	public Integer add(Housetype h) {
		return dao.add(h);
	}
	
	public Integer del(Integer houseTypeId) {
		return dao.del(houseTypeId);
	}
}
