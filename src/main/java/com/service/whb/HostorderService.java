package com.service.whb;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.whb.HostorderDAO;

@Service
public class HostorderService {
	@Resource
	HostorderDAO dao;
	public List<Map<String,Object>> queryO(){
		return dao.queryO();
	}
}
