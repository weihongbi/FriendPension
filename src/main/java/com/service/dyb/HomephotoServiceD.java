package com.service.dyb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.dyb.HomePhotoDaoD;
import com.entity.Homephoto;

@Service
public class HomephotoServiceD {
	@Resource
	HomePhotoDaoD dao;
	
	public List<Homephoto> queryAll(){
		return dao.queryAll();
	}
	
	
	public Integer add(Homephoto h) {
		return dao.add(h);
	}
	
	
	public Integer getById() {
		return dao.getById();
	}
	
	
	public Integer updateParlor(String parlor,Integer hpid) {
		return dao.updateParlor(parlor, hpid);
	}
	public Integer updateToilet(String toilet,Integer hpid) {
		return dao.updateToilet(toilet, hpid);
	}
	
	public Integer updateCookhouse(String cookhouse,Integer hpid) {
		return dao.updateCookhouse(cookhouse, hpid);
	}
	public Integer updateRests(String rests,Integer hpid) {
		return dao.updateRests(rests, hpid);
	}
}
