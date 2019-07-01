package com.service.dyb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.RentDao;
import com.entity.Rent;

@Service
public class RentService {
	@Resource
	RentDao dao;
	public List<Rent> queryAll(){
		return dao.queryAll();
	}
}
