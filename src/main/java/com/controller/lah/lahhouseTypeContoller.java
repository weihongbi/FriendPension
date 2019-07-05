package com.controller.lah;

import com.dao.lah.lahhourseTypeDao;
import com.entity.Housetype;
import com.google.gson.Gson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("htype")
public class lahhouseTypeContoller {
    @Resource
    lahhourseTypeDao dao;

    @RequestMapping("query")
    @ResponseBody
    public String query(){
    	Gson g = new Gson();
		return g.toJson(dao.query());
    }

    @RequestMapping(value = "addhtype")
    public String addhtype(Housetype ht) {
        dao.doadd(ht);
        return "redirect:query";
    }
    @RequestMapping("del")
    @ResponseBody
    public String del(Integer id){
        dao.del(id);
        return "1";
	}
	
	// 修改
	@RequestMapping("upd")
    public String upd(Housetype ht){
    	dao.doupd(ht);
        return "redirect:query";
    }
	
	@RequestMapping("tupian")
	public String tupian() {
		return "front/tupian";
	}
}
