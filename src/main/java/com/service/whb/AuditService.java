package com.service.whb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.whb.AuditDAO;
import com.entity.Audit;

@Service
public class AuditService {
	@Resource
	AuditDAO dao;
	public Integer add(Audit a) {
		return dao.add(a);
	}
	public List<Audit> queryaudit(Integer hid){
		return dao.queryaudit(hid);
	}
}
