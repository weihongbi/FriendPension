package com.controller.dyb;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Bed;
import com.service.dyb.BedService;

@Controller
@RequestMapping(value="bed")
public class BedController {
	@Resource
	BedService bs;
	
	@RequestMapping(value="queryAll")
	@ResponseBody
	public List<Map<String,Object>> queryAll(){
		return bs.queryAll();
	}
	
	@RequestMapping(value="add")
	@ResponseBody
	public Integer add(Bed b){
		return bs.add(b);
	}
}
