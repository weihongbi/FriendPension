package com.service.dyb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.thymeleaf.expression.Arrays;

import com.dao.dyb.AreaDaoD;
import com.dao.dyb.CityDaoD;
import com.dao.dyb.ProvinceDaoD;
import com.entity.Areas;
import com.entity.Cities;
import com.entity.Provinces;

@Service
public class ProvinceServiceD {
	@Resource
	ProvinceDaoD pd;
	@Resource
	CityDaoD cd;
	@Resource
	AreaDaoD ad;
	
	public List<Provinces> queryProvince(){
		return pd.queryAll();
	}
	
	public List<Cities> queryCity(){
		return cd.queryAll();
	}
	
	public List<Areas> queryArea(){
		return ad.queryAll();
	}
	
	public List<Cities> listCity(Integer provinceid){
		return cd.listCity(provinceid);
	}
	
	
	public List<Areas> listArea(Integer cityid){
		return ad.listArea(cityid);
	}
}
