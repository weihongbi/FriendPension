package com.controller.dyb;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Homedetails;
import com.service.dyb.ApartmentService;
import com.service.dyb.BedService;
import com.service.dyb.HomeDetailService;

@RestController
@RequestMapping(value="homeDetail")
public class HomeDetailController {
	@Resource
	HomeDetailService hds;
	@Resource
	ApartmentService as;
	@Resource
	BedService bs;
	@RequestMapping(value="add")
	public Integer add(Homedetails hd) {
		Integer apartmentsid = as.getByid();
		Integer bedid = bs.getByid();
		hd.setApartmentsid(apartmentsid);
		hd.setBedid(bedid);
		return hds.add(hd);
	}
	
	
	
}
