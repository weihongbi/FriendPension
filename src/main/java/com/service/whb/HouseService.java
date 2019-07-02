package com.service.whb;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.whb.HouseDAO;
import com.entity.Homephoto;
import com.entity.House;

@Service
public class HouseService {
	@Resource
	HouseDAO dao;
	public List<Map<String,Object>> query(){
		return dao.query();
	}
	public Integer uphouse(Integer hid) {
		return dao.uphouse(hid);
	}
	public List<Homephoto> queryPhoto(Integer hpid){
		return dao.queryPhoto(hpid);
	}
}
