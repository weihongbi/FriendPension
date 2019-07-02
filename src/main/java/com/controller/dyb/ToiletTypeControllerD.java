package com.controller.dyb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Toilettype;
import com.service.dyb.ToiletTypeServiceD;

@Controller
@RequestMapping(value="toiletType")
public class ToiletTypeControllerD {
	@Resource
	ToiletTypeServiceD ts;
	@RequestMapping(value="queryAll")
	@ResponseBody
	public List<Toilettype> queryAll(){
		return ts.queryAll();
	}
}
