package com.controller.lah;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.lah.lahhouseDao;



@Controller
@RequestMapping("house")
public class lahHouController {
	  @Resource
      lahhouseDao dao;
	
	  @RequestMapping("fangkeorder")
	  public String fagkeorder(Model model){
		   model.addAttribute("olist",dao.queryOrder());
		   return "front/fangkeorder";
	  }
	  @RequestMapping("fangkeorderid")
	  public String fagkeorderid(Model model,Integer oid){
		   model.addAttribute("olist",dao.queryOrderByid(oid));
		   return "front/fangkeorder";
	  }
	  @RequestMapping("fangkeorderidd")
	  public String fagkeorderidd(Model model,Integer hoid){
		   model.addAttribute("olist",dao.queryOrderid(hoid));
		   return "front/orderQuery";
	  }
	  @RequestMapping("upStates")
	  public String upStates(Integer hoid) {
			dao.upstates(hoid);
			return "redirect:fangkeorderid";
	  }
	  @RequestMapping("deloid")
	  public String deloid(Integer hoid) {
			dao.deloid(hoid);
			return "redirect:fangkeorderid";
	  }
	  @RequestMapping("query") 
	  public String query(Model model){
		  model.addAttribute("list",dao.queryAll()); 
		  return "front/fangwuxiangqing"; 
	  }
	  
	  
	  @RequestMapping("queryid") 
	  public String queryid(Model model,int hid){
		  model.addAttribute("list",dao.queryId(hid)); 
		  return "front/fangwuxiangqing"; 
	  }
	  
	 
}
