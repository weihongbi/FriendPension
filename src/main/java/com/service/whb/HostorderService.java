package com.service.whb;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.whb.HostorderDAO;
import com.entity.Hostorder;

@Service
public class HostorderService {
	@Resource
	HostorderDAO dao;
	public List<Map<String,Object>> queryO(){
		return dao.queryO();
	}
	public Integer update(Integer hoid) {
		return dao.update(hoid);
	}
	public List<Hostorder> query(Integer hoid){
		return dao.query(hoid);
	}
}
