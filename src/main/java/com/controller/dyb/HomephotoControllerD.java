package com.controller.dyb;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.DB.PhotoUpload;
import com.entity.Homephoto;
import com.service.dyb.HomephotoServiceD;

@Controller
@RequestMapping(value="homephoto")
public class HomephotoControllerD {
	@Resource
	HomephotoServiceD hs;
	private static final Logger LOGGER = LoggerFactory.getLogger(HomephotoControllerD.class);
	@RequestMapping(value="queryAll")
	@ResponseBody
	public List<Homephoto> queryAll(){
		return hs.queryAll();
	}
	
	@RequestMapping(value = "homePhotoadd", method = RequestMethod.POST)
	@ResponseBody
    public void homePhotoadd(List<MultipartFile> files,HttpServletRequest request) {
		System.out.println("homePhotoadd");
		files = ((MultipartHttpServletRequest) request)
          .getFiles("bedroom");
		PhotoUpload p=new PhotoUpload();
		String bedroom=p.Photoupload(files, request);
		System.out.println(bedroom);
		Homephoto h=new Homephoto();
		h.setBedroom(bedroom);
		Integer add = hs.add(h);
		System.out.println(add);
    }
	
	@RequestMapping(value = "updateParlor", method = RequestMethod.POST)
	@ResponseBody
	public void updateParlor(List<MultipartFile> files,HttpServletRequest request) {
		System.out.println("updateParlor");
		files = ((MultipartHttpServletRequest) request)
		          .getFiles("parlor"); 
		PhotoUpload p=new PhotoUpload();
		String parlor=p.Photoupload(files, request);
		
		Integer hpid=hs.getById();
		System.out.println(hpid);
		Integer updateParlor = hs.updateParlor(parlor, hpid);
		System.out.println(updateParlor);
	}
	
	@RequestMapping(value = "updateToilt", method = RequestMethod.POST)
	@ResponseBody
	public void updateToilt(List<MultipartFile> files,HttpServletRequest request) {
		System.out.println("updateToilt");
		files = ((MultipartHttpServletRequest) request)
		          .getFiles("toilet");
		PhotoUpload p=new PhotoUpload();
		String toilet=p.Photoupload(files, request);
		
		Integer hpid=hs.getById();
		System.out.println(hpid);
		
		Integer updateToilet = hs.updateToilet(toilet, hpid);
		System.out.println(updateToilet);
	}
	@RequestMapping(value = "updateCookhouse", method = RequestMethod.POST)
	@ResponseBody
	public void updateCookhouse(List<MultipartFile> files,HttpServletRequest request) {
		System.out.println("updateCookhouse");
		files = ((MultipartHttpServletRequest) request)
		          .getFiles("cookhouse");
		PhotoUpload p=new PhotoUpload();
		String cookhouse=p.Photoupload(files, request);
		
		Integer hpid=hs.getById();
		Integer updateCookhouse = hs.updateCookhouse(cookhouse, hpid);
		System.out.println(updateCookhouse);
	}
	
	@RequestMapping(value = "updateRests", method = RequestMethod.POST)
	@ResponseBody
	public void updateRests(List<MultipartFile> files,HttpServletRequest request) {
		System.out.println("updateRests");
		files = ((MultipartHttpServletRequest) request)
		          .getFiles("rests");
		PhotoUpload p=new PhotoUpload();
		String rests=p.Photoupload(files, request);
		System.out.println(rests);
		Integer hpid=hs.getById();
		System.out.println(hpid);
		Integer updateRests = hs.updateRests(rests, hpid);
		System.out.println(updateRests);
	}
}
