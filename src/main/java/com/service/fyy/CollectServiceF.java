package com.service.fyy;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.fyy.CollectDaoF;
@Service
public class CollectServiceF implements CollectDaoF {
	@Resource
	CollectDaoF dao;
	
	public List<Map<String, Object>> querycollect(int cid) {
		return dao.querycollect(cid);
	}

	
	public int delcollect(int collectid) {
		return dao.delcollect(collectid);
	}

}
