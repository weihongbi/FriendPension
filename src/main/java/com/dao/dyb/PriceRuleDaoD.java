package com.dao.dyb;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Pricerule;

@Mapper
public interface PriceRuleDaoD {
	@Insert(value="INSERT INTO `house`.`pricerule`(`pruleId`, `price`, `promotion`, `earnest`, `cleaningFee`, `allow`, `priceRule`)"
			+ " VALUES (null, #{price}, #{promotion},#{earnest}, #{cleaningFee}, #{allow}, #{priceRule})")
	public Integer add(Pricerule p);
	@Select(value="select max(pruleId) from pricerule")
	public Integer getById();
	
}
