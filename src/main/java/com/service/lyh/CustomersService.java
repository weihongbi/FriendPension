package com.service.lyh;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.lyh.CustomersDao;
import com.entity.Pages;
import com.entity.Customers;


@Service
public class CustomersService {
	@Resource
	CustomersDao dao;

	public List<Customers> query(){
		return dao.query();
	}
	public Pages queryPage(Integer pageNum, Integer pageSize){
		Pages pages=new Pages();
		pages.setRows(dao.queryPage((pageNum-1)*pageSize, pageSize));
		pages.setTotal(dao.getCount());
		return pages;
	}
}
