package com.dao.lah;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.entity.Homedetails;

@Mapper
public interface houseDetailDao {
	List<Homedetails> query();
	int doadd(Homedetails hd);
	int doupd(Homedetails hd);
	Homedetails getid(Integer id);
}
