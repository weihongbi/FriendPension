package com.service.whb;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Service;

import com.dao.whb.HomestateDAO;
import com.entity.Homestate;

@Service
public class HomestateService {
	@Resource
	HomestateDAO dao;
	public Integer addHome(Homestate h) {
		return dao.homeAdd(h);
	}
	
	public Integer delHome(Integer sid) {
		return dao.homeDel(sid);
	}
	public List<Homestate> find(Integer hid){
		return dao.query(hid);
	}
}
