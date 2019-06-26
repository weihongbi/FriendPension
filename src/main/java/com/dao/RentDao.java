package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Rent;

@Mapper
public interface RentDao {
	@Select("select *from rent")
	List<Rent> query();
}
