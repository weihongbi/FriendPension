package com.dao.fyy;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.Customers;
@Mapper
public interface CustomersDaoF {
	
	@Select("select * from customers where cid=#{cid}")
	public List<Customers> querycustomers(int cid);
	
	@Update("UPDATE `house`.`customers` SET `cname`=#{cname}, `password`=#{password}, `idcard`=#{idcard}, `phone`=#{phone}, `city`=#{city}, `picture`=#{picture}, `email`=#{email}, `sex`=#{sex} WHERE (`cid`=#{cid})")
	public int upcus(Customers c);
	
	@Update("UPDATE `house`.`customers` SET  `picture`=#{picture} WHERE (`cid`=#{cid})")
	public int uppic(Customers c);
	
	
	@Update("UPDATE `house`.`customers` SET  `password`=#{password} WHERE (`cid`=#{cid})")
	public int uppwd(Customers c);
	
}
