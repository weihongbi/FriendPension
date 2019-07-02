package com.service.lyh;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.lyh.houseDao;
import com.entity.Housetype;

@Service
public class LyhhouseService {
	@Resource
	houseDao dao;
	
	public List<Map<String,Object>> queryAll(){
		return dao.queryAll();
	}
	
	public List<Housetype> queryhouseType(){
		return dao.queryhouseType();
	}
	
	public List<Map<String,Object>> query2(String city,String houseTypeName,String rentName,Integer livablePeople, Integer pageNum){
		return dao.query2(city, houseTypeName, rentName,livablePeople,(pageNum - 1));
	}
	
	public Integer Count(String city,String houseTypeName,String rentName,Integer livablePeople){
		return dao.Count(city, houseTypeName, rentName, livablePeople);
	}
	
}
