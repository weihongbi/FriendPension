package com.service.dyb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.RentDaoD;
import com.entity.Rent;

@Service
public class RentsServiceD {
	@Resource
	RentDaoD dao;
	public List<Rent> queryAll(){
		return dao.queryAll();
	}
}
