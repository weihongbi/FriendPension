package com.dao.dyb;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Rent;

@Mapper
public interface RentDaoD {
	@Select(value="select * from rent")
	public List<Rent> queryAll();
}
