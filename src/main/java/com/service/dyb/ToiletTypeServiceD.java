package com.service.dyb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.ToiletTypeDaoD;
import com.entity.Toilettype;

@Service
public class ToiletTypeServiceD{
	@Resource
	ToiletTypeDaoD dao;
	
	public List<Toilettype> queryAll(){
		
		return dao.queryAll();
	}
}
