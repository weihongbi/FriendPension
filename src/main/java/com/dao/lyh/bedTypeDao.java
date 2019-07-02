package com.dao.lyh;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.Bedtype;

@Mapper
public interface bedTypeDao {
	@Insert("insert into bedType (bedTypeName) values (#{bedTypeName})")
	int add(Bedtype b);

	@Select("select * from bedType")
	public List<Bedtype> query();
	
	@Select("select * from bedType where bedTypeid=#{bedTypeid}")
	Bedtype queryById(Integer bedTypeid);

	@Update("update bedType set bedTypeName=#{bedTypeName} where bedTypeId=#{bedTypeId}")
	int update(Bedtype b);

	@Delete("delete from bedType where bedTypeId=#{bedTypeid}")
	int del(Integer bedTypeid);
}
