package com.service.lyh;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.lyh.rentDao;
import com.entity.Rent;


@Service
public class rentService {
	@Resource
	rentDao dao;

	
	public int add(Rent r){
		return dao.add(r);
	}
	
	public List<Rent> query(){
		return dao.query();
	}
	
	public Rent queryById(Integer rentid){
		return dao.queryById(rentid);
	}

	public int update(Rent r) {
		return dao.update(r);
	}
	
	public int del(Integer rentid) {
		return dao.del(rentid);
	}

}
