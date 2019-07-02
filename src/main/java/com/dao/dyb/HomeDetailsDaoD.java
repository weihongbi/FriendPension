package com.dao.dyb;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Homedetails;

@Mapper
public interface HomeDetailsDaoD {
	
	
	@Insert(value="INSERT INTO `house`.`homedetails`"
			+ " (`homedid`, `provinceId`, `cityid`, `areaid`, `houseTypeId`, `rentid`, `Apartmentsid`, `rentarea`, `toiletTypeId`, `bedid`, `livablePeople`, `together`, `identicalHouse`)"
			+ " VALUES (null, #{provinceId}, #{cityid}, #{areaid}, #{houseTypeId}, #{rentid}, #{Apartmentsid}, #{rentarea}, #{toiletTypeId}, #{bedid}, #{livablePeople}, #{together}, #{identicalHouse})")
	public Integer add(Homedetails hd);
	
	@Select(value="select max(homedid) from homedetails")
	public Integer getById();
}
