package com.DB;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.entity.Homephoto;

public class PhotoUpload {
	MultipartFile file = null; 
    BufferedOutputStream stream = null;
    String uploadFilePath="";
    String photoName="";
	 public String Photoupload(List<MultipartFile> files,HttpServletRequest request) {
	      for (int i = 0; i < files.size(); ++i) {
	        file = files.get(i);
	        if (!file.isEmpty()) {
	          try {
	            uploadFilePath = file.getOriginalFilename();
	            String newFileName=UUID.randomUUID()+""+uploadFilePath.substring(uploadFilePath.indexOf("."));
	            stream = new BufferedOutputStream(new FileOutputStream(new File(
	                "E:\\学习\\s3\\结业项目\\FriendPension\\src\\main\\resources\\static\\upload\\" + newFileName)));
	            byte[] bytes = file.getBytes();
	            stream.write(bytes,0,bytes.length);
	            photoName+=newFileName+";";
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
	      photoName=photoName.substring(0, photoName.length()-1);
	      return photoName;
	    }
}
