package com.controller.lah;

import com.dao.lah.hourseTypeDao;
import com.entity.Housetype;
import com.google.gson.Gson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("htype")
public class houseTypeContoller {
    @Resource
    hourseTypeDao dao;

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
    public String del(Integer id){
        dao.del(id);
        return "redirect:/query";
    }
    
    @RequestMapping("update")
    public ModelAndView update(int id) {
    	Housetype cust = dao.getid(id);
        ModelAndView mav = new ModelAndView("upd");
        mav.addObject("c", cust);
        return mav;
    }

    // 修改
    @RequestMapping("upd")
    public String upd(Housetype ht){
    	dao.doupd(ht);
        return "redirect:query";
    }
}
