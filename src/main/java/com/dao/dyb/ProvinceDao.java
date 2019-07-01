package com.dao.dyb;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Provinces;
@Mapper
public interface ProvinceDao {
	@Select(value="select * from provinces")
	public List<Provinces> queryAll();
}
