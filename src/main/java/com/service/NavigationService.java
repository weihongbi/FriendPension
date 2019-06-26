package com.service;

import com.dao.NavigationDao;
import com.entity.Navigation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NavigationService {
	@Resource
	NavigationDao dao;
	public List<Navigation> query() {
		return dao.query();
	}
	public String queryRids(Integer rid) {
		return dao.queryRids(rid);
	}
}
