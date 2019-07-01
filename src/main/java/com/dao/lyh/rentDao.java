package com.dao.lyh;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.Rent;



@Mapper
public interface rentDao {

	@Insert("insert into rent (rentName) values (#{rentName})")
	int add(Rent r);

	@Select("select * from rent")
	public List<Rent> query();
	
	@Select("select * from rent where rentid=#{rentid}")
	Rent queryById(Integer rentid);

	@Update("update rent set rentName=#{rentName} where rentid=#{rentid}")
	int update(Rent u);

	@Delete("delete from rent where rentid=#{rentid}")
	int del(Integer rentid);

}
