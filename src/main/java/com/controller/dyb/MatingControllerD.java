package com.controller.dyb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Mating;
import com.service.dyb.MatingServiceD;
@Controller
@RequestMapping(value="mating")
public class MatingControllerD {
	@Resource
	MatingServiceD ms;
	
	@RequestMapping(value="queryAll")
	@ResponseBody
	public List<Mating> queryAll(){
		return ms.queryAll();
	}
	@RequestMapping(value="add")
	@ResponseBody
	public Integer add(Mating m) {
		System.out.println("add");
		return ms.add(m);
	}
	@RequestMapping(value="del")
	@ResponseBody
	public Integer del(Integer id) {
		System.out.println("del");
		return ms.del(id);
	}
	@RequestMapping(value="update")
	@ResponseBody
	public Integer update(Mating m) {
		System.out.println("update");
		return ms.update(m);
	}
}
