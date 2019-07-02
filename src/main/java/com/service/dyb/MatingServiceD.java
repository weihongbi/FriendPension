package com.service.dyb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.MatingDaoD;
import com.entity.Mating;

@Service
public class MatingServiceD {
	@Resource
	MatingDaoD dao;
	public List<Mating> queryAll(){
		return dao.queryAll();
	}
	
	public Integer add(Mating m) {
		return dao.add(m);
	}
	
	public Integer del(Integer id) {
		return dao.del(id);
	}
	
	public Integer update(Mating m) {
		return dao.update(m);
	}
}
