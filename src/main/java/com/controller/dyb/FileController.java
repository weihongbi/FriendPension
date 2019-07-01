package com.controller.dyb;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.entity.Homephoto;
import com.service.dyb.HomephotoService;

import ch.qos.logback.core.util.FileUtil;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
@RequestMapping(value="file")
public class FileController {
	@Resource
	HomephotoService hs;
	private static final Logger logger = LoggerFactory.getLogger(FileController.class);
	@RequestMapping(value = "upload",method = RequestMethod.POST) 
	@ResponseBody
    public String upload(@RequestParam("files") MultipartFile file) {
		System.out.println("upload");
		System.out.println(file);
		try {
			if (file.isEmpty()) {
	            return "文件为空";
	        }
	        // 获取文件名
	        String fileName = file.getOriginalFilename();
	        logger.info("上传的文件名为：" + fileName);
	        // 获取文件的后缀名
	        String suffixName = fileName.substring(fileName.lastIndexOf("."));
	        logger.info("上传的后缀名为：" + suffixName);
	        // 文件上传后的路径
	        String filePath = "E://upload//";
	        // 解决中文问题，liunx下中文路径，图片显示问题
	        // fileName = UUID.randomUUID() + suffixName;
	        File dest = new File(filePath + fileName);
	        // 检测是否存在目录
	        if (!dest.getParentFile().exists()) {
	            dest.getParentFile().mkdirs();
	        }
            file.transferTo(dest);
            Homephoto h=new Homephoto();
            h.setBedroom(fileName);
            Integer add = hs.add(h);
            System.out.println(add);
            return "上传成功";
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }
    
    @RequestMapping(value = "testUploadFiles", method = RequestMethod.POST)
    @ResponseBody
    public String handleFileUpload1(HttpServletRequest request) {
      List<MultipartFile> files = ((MultipartHttpServletRequest) request)
          .getFiles("file");
      MultipartFile file = null;
      BufferedOutputStream stream = null;
      String uploadFilePath="";
      String photoName="";
      for (int i = 0; i < files.size(); ++i) {
        file = files.get(i);
        if (!file.isEmpty()) {
          try {
            uploadFilePath = file.getOriginalFilename();
            System.out.println("uploadFlePath:" + uploadFilePath);
            // 截取上传文件的文件名
            String uploadFileName = uploadFilePath
                .substring(uploadFilePath.lastIndexOf('\\') + 1,
                    uploadFilePath.indexOf('.'));
            System.out.println("multiReq.getFile()" + uploadFileName);
            // 截取上传文件的后缀
            String uploadFileSuffix = uploadFilePath.substring(
                uploadFilePath.indexOf('.') + 1, uploadFilePath.length());
            System.out.println("uploadFileSuffix:" + uploadFileSuffix);
            stream = new BufferedOutputStream(new FileOutputStream(new File(
                "E:\\学习\\s3\\结业项目\\FriendPension\\src\\main\\resources\\static\\upload\\" 
            + uploadFileName + "." + uploadFileSuffix)));
            System.out.println(stream);
            byte[] bytes = file.getBytes();
            stream.write(bytes,0,bytes.length);
            photoName+=uploadFilePath+";";
          } catch (Exception e) {
            e.printStackTrace();
          } finally {
            try {
              if (stream != null) {
                stream.close();
              }
            } catch (IOException e) {
              e.printStackTrace();
            }
          }
        } else {
          System.out.println("上传文件为空");
        }
      }
      Homephoto h=new Homephoto();
      h.setCookhouse(photoName);
      Integer add = hs.add(h);
      System.out.println(add);
      System.out.println("文件接受成功了");
      return "上传成功";
    }
	
}
