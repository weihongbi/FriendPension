package com.dao.whb;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Zhuanmoney;
@Mapper
public interface ZhuanmoneyDAO {
	@Insert("INSERT INTO `house`.`zhuanmoney` (`hoid`, `extractrate`, `pingprice`, `dongprice`) VALUES (#{hoid}, #{extractrate}, #{pingprice}, #{dongprice})")
	Integer add(Zhuanmoney z);
	@Select("select z.*,h.*,(select cname from customers where cid  = (select cid from house where hid =h.hid)) cname  from zhuanmoney z LEFT JOIN hostorder h on z.hoid = h.hoid where z.hoid=#{hoid}")
	public List<Map<String,Object>> queryZhuan(Integer hoid);
}
