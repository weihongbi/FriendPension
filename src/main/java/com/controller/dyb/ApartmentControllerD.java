package com.controller.dyb;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Apartments;
import com.service.dyb.ApartmentServiceD;

@RestController
@RequestMapping(value="apartment")
public class ApartmentControllerD {
	@Resource
	ApartmentServiceD as;
	
	@RequestMapping(value="add")
	public Integer add(Apartments a) {
		return as.add(a);
	}
	
	
}
