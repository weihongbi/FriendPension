package com.dao.dyb;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Toilettype;


@Mapper
public interface ToiletTypeDao {
	@Select(value="select * from toilettype")
	public List<Toilettype> queryAll();
}
