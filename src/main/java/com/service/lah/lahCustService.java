package com.service.lah;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.lah.lahcustomerDao;
import com.entity.Customers;

@Service
public class lahCustService {
	@Resource
	lahcustomerDao dao;
	
	public List<Customers> login(String cname, String password) {
		return dao.login(cname,password);
	}
	public int doadd(Customers c){
		return dao.doadd(c);
	}

}
