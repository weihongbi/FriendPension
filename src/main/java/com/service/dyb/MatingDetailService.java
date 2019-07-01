package com.service.dyb;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.MatingDetailDao;
import com.entity.Matingdetails;

@Service
public class MatingDetailService {
	@Resource
	MatingDetailDao dao;
	
	public List<Map<String,Object>> queryAll(){
		return dao.queryAll();
	}
	public List<Matingdetails> queryById(Integer matingid){
		return dao.queryById(matingid);
	}
	public Integer add(Matingdetails m) {
		return dao.add(m);
	}
	
	public Integer del(Integer id) {
		return dao.del(id);
	}
	
	public List<Matingdetails> list1(){
		return dao.list1();
	}
	public List<Matingdetails> list2(){
		return dao.list2();
	}
	public List<Matingdetails> list3(){
		return dao.list3();
	}
	public List<Matingdetails> list4(){
		return dao.list4();
	}
	public List<Matingdetails> list5(){
		return dao.list5();
	}
}
