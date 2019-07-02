package com.controller.dyb;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Homedetails;

import com.service.dyb.ApartmentServiceD;

import com.service.dyb.BedServiceD;

import com.service.dyb.HomeDetailServiceD;

@RestController
@RequestMapping(value="homeDetail")
public class HomeDetailControllerD {
	@Resource
	HomeDetailServiceD hds;
	@Resource
	ApartmentServiceD as;
	@Resource
	BedServiceD bs;
	@RequestMapping(value="add")
	public Integer add(Homedetails hd) {
		Integer apartmentsid = as.getByid();
		Integer bedid = bs.getByid();
		hd.setApartmentsid(apartmentsid);
		hd.setBedid(bedid);
		return hds.add(hd);
	}
	
	
	
}
