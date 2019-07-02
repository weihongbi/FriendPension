package com.controller.dyb;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Housetype;
import com.service.dyb.HouseTypeServiceD;

@Controller
@RequestMapping(value="housetype")
public class HouseTypeControllerD {
		@Resource
		HouseTypeServiceD hs;

	
	  @RequestMapping(value="queryAll")
	  @ResponseBody
	  public List<Housetype> queryAll(HttpSession session) {
		  System.out.println(111);
		  List<Housetype> queryAll = hs.queryAll();
		  return queryAll; 
	  }
	@RequestMapping(value="add")
	@ResponseBody
	public Integer add(Housetype t) {
		return hs.add(t);
	}
	@RequestMapping(value="del")
	@ResponseBody
	public Integer del(Integer houseTypeId) {
		return hs.del(houseTypeId);
	}
}
