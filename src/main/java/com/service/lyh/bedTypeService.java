package com.service.lyh;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.lyh.bedTypeDao;
import com.entity.Bedtype;


@Service
public class bedTypeService {
	@Resource
	bedTypeDao dao;

	
	public int add(Bedtype b){
		return dao.add(b);
	}
	
	public List<Bedtype> query(){
		return dao.query();
	}
	
	public Bedtype queryById(Integer bedTypeId){
		return dao.queryById(bedTypeId);
	}

	public int update(Bedtype b) {
		return dao.update(b);
	}
	
	public int del(Integer bedTypeid) {
		return dao.del(bedTypeid);
	}

}
