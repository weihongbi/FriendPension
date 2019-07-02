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
	public Integer addHome(String checkintime,String leavetime,Integer hid,Integer cid) {
		return dao.homeAdd(checkintime,leavetime,hid,cid);
	}
	
	public Integer delHome(Integer sid) {
		return dao.homeDel(sid);
	}
	public List<Homestate> find(String yutime,Integer hid){
		return dao.query(yutime, hid);
	}
}
