package com.dao.dyb;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Rule;

@Mapper
public interface RuleDao {
	@Insert(value="INSERT INTO `house`.`rule`(`ruleid`, `deal`, `renege`, `rule`, `minday`, `maxday`, `reception`, `otherRequire`, `hoideTips`)"
			+ " VALUES (null, #{deal}, #{renege}, #{rule}, #{minday}, #{maxday}, #{reception},#{otherRequire}, #{hoideTips})")
	public Integer add(Rule r);
	
	@Select(value="select max(ruleid) from rule")
	public Integer getByid();
	
	
}
