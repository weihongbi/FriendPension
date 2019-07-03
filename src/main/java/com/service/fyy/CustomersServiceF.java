package com.service.fyy;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.dao.fyy.CustomersDaoF;
import com.entity.Customers;
@Service
public class CustomersServiceF implements CustomersDaoF {
	@Resource
	CustomersDaoF dao;
	
	public List<Customers> querycustomers(int cid) {
		return dao.querycustomers(cid);
	}

	public int upcus(Customers c) {
		return dao.upcus(c);
	}
	
	public int uppic(Customers c) {
		return dao.uppic(c);
	}

	
	public int uppwd(Customers c) {
		return dao.uppwd(c);
	}


	

}
