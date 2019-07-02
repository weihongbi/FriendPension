package com.dao.dyb;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Apartments;

@Mapper
public interface ApartmentsDaoD {
	
	@Insert(value="INSERT INTO `house`.`apartments`(`Apartmentsid`, `bedroom`, `parlor`, `toilet`, `cookhouse`, `balcony`)"
			+ " VALUES (null, #{bedroom}, #{parlor}, #{toilet}, #{cookhouse}, #{balcony})")
	public Integer add(Apartments a);
	
	@Select(value="select max(Apartmentsid) from apartments")
	public Integer getById();
}
