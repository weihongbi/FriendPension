package com.dao.dyb;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Areas;
@Mapper
public interface AreaDao {
	@Select(value="select * from areas")
	public List<Areas> queryAll();
	
	@Select(value="select * from areas where cityid=#{cityid}")
	public List<Areas> listArea(Integer cityid);
}
