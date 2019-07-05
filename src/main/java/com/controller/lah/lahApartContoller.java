package com.controller.lah;

import com.dao.lah.lahApartmentDAO;
import com.entity.Apartments;
import com.google.gson.Gson;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.annotation.Resource;

@Controller
@RequestMapping("apart")
public class lahApartContoller {
    @Resource
    lahApartmentDAO dao;

    @RequestMapping("query")
    @ResponseBody
    public String query(){
    	Gson g = new Gson();
		return g.toJson(dao.query());
    }
    

    @RequestMapping(value = "addapart")
    public String addapart(Apartments a) {
        dao.doadd(a);
        return "redirect:/query";
    }
}
