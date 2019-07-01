package com.service.dyb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.dao.dyb.HouseTypeDao;
import com.entity.Housetype;

@Service
public class HouseTypeService {
	@Resource
	HouseTypeDao dao;
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
