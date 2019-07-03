package com.controller.whb;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.lah.houseDaoL;
import com.entity.Homestate;
import com.google.gson.Gson;
import com.service.whb.HomestateService;

@Controller
@RequestMapping("homesate")
public class HomestateController {
	@Resource
	HomestateService service;
	@Resource
	houseDaoL dao;
	@RequestMapping("find")
	@ResponseBody
	public String find(HttpSession session,Date yutime,Date leavetime,Integer hid,Integer cid) {
		List<Homestate> find = service.find(yutime, hid);		
		if(find.size()==0) {
			//cid房客是页面写死的
			//service.addHome(yutime,leavetime,hid, cid);
			List<Homestate> list = service.find(hid, cid);
			session.setAttribute("lists",list.get(0));
			List<Map<String, Object>> queryAll = dao.queryAll();
			session.setAttribute("list", queryAll.get(0));
			Integer total = (((int)(yutime.getTime()-leavetime.getTime())*((int)queryAll.get(0).get("price")))+(int)(queryAll.get(0).get("earnest")));
			return "1";
		}else {
			Gson g = new Gson();
			return g.toJson(find.get(0));
		}
		
	}
	@RequestMapping("delete")
	@ResponseBody
	public String delete(Integer sid) {
		service.delHome(sid);
		return "1";
	}
}
