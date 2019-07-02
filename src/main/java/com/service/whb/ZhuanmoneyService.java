package com.service.whb;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.whb.ZhuanmoneyDAO;
import com.entity.Zhuanmoney;

@Service
public class ZhuanmoneyService {
	@Resource
	ZhuanmoneyDAO dao;
	public Integer add(Zhuanmoney z) {
		return dao.add(z);
	}
	public List<Map<String,Object>> queryZhuan(Integer hoid){
		return dao.queryZhuan(hoid);
	}
}
