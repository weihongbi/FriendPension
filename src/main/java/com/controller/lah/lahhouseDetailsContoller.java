package com.controller.lah;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.lah.lahhouseDetailDao;
import com.entity.Homedetails;

import java.util.List;

import javax.annotation.Resource;

@Controller
@RequestMapping("/hdetails")
public class lahhouseDetailsContoller {
    @Resource
    lahhouseDetailDao dao;

    @RequestMapping("pagequery")
    public String pagequery() {
    	return "back/housedetails";
    }
    @RequestMapping("query")
    @ResponseBody
    public List<Homedetails> query(){
        return dao.query();
    }
}
