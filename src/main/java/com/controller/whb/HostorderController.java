package com.controller.whb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Resource;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import com.dao.lah.lahhouseDao;
import com.entity.Hostorder;
import com.google.gson.Gson;
import com.service.whb.HostorderService;

@Controller
@RequestMapping("hostorder")
public class HostorderController {
	@Resource
	HostorderService service;
	@Resource
	lahhouseDao dao;
	@RequestMapping("queryO")
	@ResponseBody
	public String queryO() {
		Gson g = new Gson();
		return g.toJson(service.queryO());
	}
	@RequestMapping("addOreder")
	public String addOreder(Hostorder h) {					
		service.addOrder(h);		
		return "redirect:/pay";
	}
	@InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一直 如2015-9-9 就应该为yyyy-MM-dd
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }
}
