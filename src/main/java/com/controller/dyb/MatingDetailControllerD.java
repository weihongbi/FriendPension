package com.controller.dyb;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Matingdetails;
import com.service.dyb.MatingDetailServiceD;

@Controller
@RequestMapping(value="matingdetail")
public class MatingDetailControllerD {
	@Resource
	MatingDetailServiceD mds;
	@RequestMapping(value="queryAll")
	@ResponseBody
	public List<Map<String,Object>> queryAll(){
		return mds.queryAll();
	}
	@RequestMapping(value="queryById")
	@ResponseBody
	public List<Matingdetails> queryById(Integer matingid){
		System.out.println(mds.queryById(matingid));
		return mds.queryById(matingid);
	}
	@RequestMapping(value="add")
	@ResponseBody
	public Integer add(Matingdetails md) {
		System.out.println("add");
		return mds.add(md);
	}
	@RequestMapping(value="del")
	@ResponseBody
	public Integer del(Integer id) {
		System.out.println("del");
		return mds.del(id);
	}
}
