package com.service.whb;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.whb.TransferDAO;
import com.entity.Transfer;

@Service
public class TransferService {
	@Resource
	TransferDAO dao;
	public Integer add(Transfer t) {
		return dao.add(t);
	}
	public List<Transfer> query(Integer cid){
		return dao.query(cid);
	}
	public List<Map<String,Object>> queryAll(){
		return dao.queryAll();
	}
}
