package com.dao.dyb;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Cities;

@Mapper
public interface CityDao {
	@Select(value="select * from cities")
	public List<Cities> queryAll();
	
	@Select(value="select * from cities WHERE provinceid=#{provinceid}")
	public List<Cities> listCity(Integer provinceid);
}
