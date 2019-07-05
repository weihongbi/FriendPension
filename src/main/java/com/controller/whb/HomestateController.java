package com.controller.whb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.dao.lah.lahhouseDao;
import com.entity.Homestate;
import com.google.gson.Gson;
import com.service.whb.HomestateService;

@Controller
@RequestMapping("homesate")
public class HomestateController {
	@Resource
	HomestateService service;
	@Resource
	lahhouseDao dao;
	@RequestMapping("find")
	@ResponseBody
	public String find(HttpSession session,Date yutime,Date leavetime,Integer hid,Integer cid) {
		List<Homestate> find = service.find(yutime, hid);		
		if(find.size()==0) {			
			service.addHome(yutime,leavetime,hid, cid);
			List<Homestate> list = service.find(hid, cid);
			session.setAttribute("lists",list.get(0));
			List<Map<String, Object>> queryAll = dao.queryAll();
			session.setAttribute("list", queryAll.get(0));
			Integer total = (((int)(leavetime.getTime()-yutime.getTime())/(60*60*24*1000)*((int)queryAll.get(0).get("price")))+(int)(queryAll.get(0).get("earnest")));
			session.setAttribute("total", total);
			return "1";
		}else {
			Gson g = new Gson();
			return g.toJson(find.get(0));
		}
		
	}
	@InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一直 如2015-9-9 就应该为yyyy-MM-dd
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }
	@RequestMapping("delete")
	@ResponseBody
	public String delete(Integer sid) {
		service.delHome(sid);
		return "1";
	}
}
