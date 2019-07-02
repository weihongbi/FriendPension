package com.dao.dyb;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Housetype;
@Mapper
public interface HouseTypeDaoD {
	@Select(value="select * from housetype")
	public List<Housetype> queryAll();
	@Insert(value="INSERT INTO `house`.`housetype`(`houseTypeId`, `houseTypeName`) VALUES (null,#{houseTypeName})")
	public Integer add(Housetype h);
	@Delete(value="delete from housetype where houseTypeId=#{houseTypeId}")
	public Integer del(Integer houseTypeId);
}
