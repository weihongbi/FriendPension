package com.service.dyb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.ToiletTypeDao;
import com.entity.Toilettype;

@Service
public class ToiletTypeService {
	@Resource
	ToiletTypeDao dao;
	
	public List<Toilettype> queryAll(){
		
		return dao.queryAll();
	}
}
