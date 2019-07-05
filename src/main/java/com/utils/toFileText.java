package com.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class toFileText {
	//写
	public static String out(String str) {
		FileOutputStream fop = null;
		File out;
		String name="";
		try {
			int num=(int)(Math.random() * 1000);
			name="E:\\zhinan\\"+num+".txt";
			out = new File(name);//初始化file
			fop = new FileOutputStream(out);//初始化输出流
			// 若文件不存在,则创建它
			if (!out.exists()) {			
				out.createNewFile();
			}
			// 获取字节的内容数组
			byte[] contentInBytes = str.getBytes();
			fop.write(contentInBytes);//写出到指定路径文件中字节的内容数组
			fop.flush();fop.close();
		} catch (IOException e) { //捕捉异常
			e.printStackTrace();
		} finally {
			try {if (fop != null) {fop.close();}} 
			catch (Exception e) { //捕捉异常
				e.printStackTrace();
			}
		}
		return name;
	}
	
	public static String in(String fileName) {
		StringBuilder sb=null;
		try {
			File file = new File(fileName);
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String content = "";
			 sb= new StringBuilder();
			while(content != null){
				content = bf.readLine();
				if(content == null){
					break;
				}	
				sb.append(content.trim());
			}
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	

}
