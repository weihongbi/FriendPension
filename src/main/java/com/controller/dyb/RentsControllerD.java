package com.controller.dyb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Rent;
import com.service.dyb.RentsServiceD;

@Controller
@RequestMapping(value="rent")
public class RentsControllerD {
	@Resource
	RentsServiceD rs;
	
	@RequestMapping(value="queryAll")
	@ResponseBody
	public List<Rent> queryAll(){
		return rs.queryAll();
	}
	
}
