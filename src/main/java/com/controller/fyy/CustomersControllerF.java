package com.controller.fyy;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.dao.fyy.HostorderDaoF;
import com.entity.Customers;
import com.entity.Hostorder;
import com.service.fyy.CustomersServiceF;
import com.service.fyy.HostorderServiceF;

@Controller
@RequestMapping("customers")
public class CustomersControllerF {
	@Resource
	CustomersServiceF cservice;
	
	@Resource
	HostorderServiceF hs;
	
	/* 个人中心 */
	@RequestMapping("querycustomers")
	public String querycustomers(int cid,Model m){
		m.addAttribute("clist",cservice.querycustomers(cid));
		return "front/personal";
	}
	
	/* 修改个人中心 */
	@RequestMapping("querycustomers2")
	public String querycustomers2(int cid,Model m){
		m.addAttribute("clist",cservice.querycustomers(cid));
		return "front/upcustomers";
	}
	
	@RequestMapping("upcus")
	public String upcus(Customers c){
		cservice.upcus(c);
		return "redirect:querycustomers?cid=1";
	}
	
	/* 修改密码 */
	@RequestMapping("querycustomers3")
	public String querycustomers3(int cid,Model m){
		m.addAttribute("clist",cservice.querycustomers(cid));
		return "front/uppwd";
	}
	@RequestMapping("uppwd")
	public String uppwd(Customers c){
		int upcus = cservice.uppwd(c);
		System.out.println(upcus);
		return "redirect:querycustomers?cid=1";
	}
	
	/* 修改头像 */
	@RequestMapping("querycustomers4")
	public String querycustomers4(int cid,Model m){
		m.addAttribute("clist",cservice.querycustomers(cid));
		return "front/uploadpic";
	}
	@RequestMapping("uppic")
	public String uppic(@RequestParam("photo")MultipartFile photo,Customers c) throws IllegalStateException, IOException{
		//上传的文件名
		String originalFilename = photo.getOriginalFilename();
		if(originalFilename!=null){
			//保存路径
			 String savePath="\\E:\\ecilpse\\FriendPension\\src\\main\\resources\\static\\img\\";
			 UUID randomUUID = UUID.randomUUID();
			 String newFileName = randomUUID.toString()+"_"+originalFilename;
			 String saveFilePath =savePath+newFileName;
			 
			 System.out.println(saveFilePath+"---------");
			 photo.transferTo(new File(saveFilePath));
			 c.setCid(c.getCid());
			 
			c.setPicture("/img/"+newFileName);
			System.out.println("路径："+saveFilePath);
		}
		cservice.uppic(c);
		return "redirect:querycustomers?cid=1";
	}
	
	/* 订单管理 */
	@RequestMapping("order")
	public String order(Model m){
		m.addAttribute("olist", hs.queryhorder());
		return "front/order";
	}
	
	@RequestMapping("querystates")
	public String querystates(Model m,Integer oid){
		m.addAttribute("olist", hs.querystates(oid));
		return "front/order";
	}
	
	@RequestMapping("lookorder")
	public String lookorder(Model m,Integer hoid){
		m.addAttribute("olist", hs.queryByhoid(hoid));
		return "front/lookorder";
	}
	
	@RequestMapping("upstates")
	public String upstates(Integer hoid){
		hs.upstates(hoid);
		return "front/order";
	}
	
	
	@RequestMapping("delhorder")
	public String delhorder(int hoid){
		hs.delhorder(hoid);
		return "redirect:order";
	}
}
