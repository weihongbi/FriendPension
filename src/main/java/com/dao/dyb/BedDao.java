package com.dao.dyb;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Bed;
import com.entity.Bedtype;


@Mapper
public interface BedDao {
	@Select(value="select b.*,bt.bedTypeName from bed b left join bedtype bt on b.bedTypeId=bt.bedTypeId")
	public List<Map<String,Object>> queryAll();
	@Select(value="select * from bedtype")
	public List<Bedtype> findAll();
	
	@Insert(value="INSERT INTO `house`.`bed`(`bedid`, `bedTypeId`, `longs`, `width`, `alike`)"
			+ " VALUES (null, #{bedTypeId}, #{longs}, #{width}, #{alike})")
	public Integer add(Bed b);
	@Select(value="select max(bedid) from bed")
	public Integer getById();
	
}
