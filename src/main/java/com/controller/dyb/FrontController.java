package com.controller.dyb;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Areas;
import com.entity.Cities;
import com.entity.Provinces;
import com.service.dyb.BedService;
import com.service.dyb.HouseTypeService;
import com.service.dyb.MatingDetailService;
import com.service.dyb.MatingService;
import com.service.dyb.ProvinceService;
import com.service.dyb.RentService;
import com.service.dyb.ToiletTypeService;

@Controller
@RequestMapping(value="fabufangyuan")
public class FrontController {
	@Resource
	HouseTypeService hs;
	@Resource
	RentService rs;
	@Resource
	ToiletTypeService ts;
	@Resource
	BedService bs;
	@Resource
	MatingService ms;
	@Resource
	MatingDetailService mds;
	@Resource
	ProvinceService ps;
	@RequestMapping(value="findAll")
	public String findAll(Model model) {
	    model.addAttribute("houseType", hs.queryAll());
	    model.addAttribute("rent",rs.queryAll());
	    model.addAttribute("toiletType",ts.queryAll());
	    model.addAttribute("bed",bs.findAll());
	    model.addAttribute("province",ps.queryProvince());
	    model.addAttribute("city",ps.queryCity());
	    model.addAttribute("area",ps.queryArea());
	    return "front/fabufangyuan";
	}
	@RequestMapping(value="listPro")
	@ResponseBody
	public List<Provinces> listPro() {
		return ps.queryProvince();
	}
	
	
	
	@RequestMapping(value="listCity")
	@ResponseBody
	public List<Cities> listCity(Integer provinceid) {
		return ps.listCity(provinceid);
	}

	@RequestMapping(value="listArea")
	@ResponseBody
	public List<Areas> listArea(Integer cityid) {
		return ps.listArea(cityid);
	}
	
	@RequestMapping(value="houseDepict")
	public String houseDepict() {
		return "front/fangyuanmiaoshu";
	}
	@RequestMapping(value="matingqueryAll")
	public String matingqueryAll(Model model) {
		model.addAttribute("list1", mds.list1());
		model.addAttribute("list2", mds.list2());
		model.addAttribute("list3", mds.list3());
		model.addAttribute("list4", mds.list4());
		model.addAttribute("list5", mds.list5());
		return "front/peitaosheshi";
	}
	
	@RequestMapping(value="showpicture")
	public String showpicture() {
		return "front/zhenshizhaopian";
	}
	@RequestMapping(value="showPlue")
	public String showPlue() {
		return "front/jiageguige";
	}
	
	
	
	@GetMapping(value="add")
	@ResponseBody
    public List<Areas> add()
    {
        return ps.queryArea();
    }
	@PostMapping(value="getArea")
	@ResponseBody
    public List<Cities> getArea(Integer provinceid){
		System.out.println(provinceid);
		List<Cities> listCity = ps.listCity(provinceid);
		System.out.println(listCity);
        return listCity;  //此处查出一个list<map>
    }
}
