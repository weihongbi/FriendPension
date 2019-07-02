package com.dao.dyb;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.House;

@Mapper
public interface HouseDaoD {
	
	@Insert(value="INSERT INTO `house`.`house`"
			+ " (`hid`, `homedid`, `hname`, `hpid`, `selfdom`, `interior`, `traffic`, `ambitus`, `matingId`, `ruleid`, `pruleId`, `reserveWay`, `rule`, `state`, `cid`,`fnum`)"
			+ " VALUES (null, #{homedid}, #{hname}, #{hpid}, #{selfdom}, #{interior}, #{traffic}, #{ambitus}, #{matingId},#{ruleid}, #{pruleId}, '网上预订', #{rule},0, null,#{fnum})")
	public Integer add(House h);
	
	@Select(value="select max(hid) from house")
	public Integer getById();
	
	@Update(value="update house set matingId=#{matingId} where hid=#{hid}")
	public Integer updateMating(@Param("matingId")String matingId,@Param("hid")Integer hid);
	
	@Update(value="update house set hpid=#{hpid},ruleid=#{ruleid},pruleId=#{pruleId},rule=#{rule} where hid=#{hid}")
	public Integer updateHouse(@Param("hpid")Integer hpid,@Param("ruleid")Integer ruleid,@Param("pruleId")Integer pruleId,@Param("rule")Integer rule,@Param("hid")Integer hid);
	
	
	
	
}
