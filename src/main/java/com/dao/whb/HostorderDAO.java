package com.dao.whb;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.Hostorder;

@Mapper
public interface HostorderDAO {
	@Select("select ho.*,c.cname,c.phone from hostorder ho LEFT JOIN customers c on ho.cid = c.cid")
	List<Map<String,Object>> queryO();
	@Update("UPDATE `house`.`hostorder` SET `states`=2 WHERE (`hoid`=#{hoid})")
	Integer update(Integer hoid);
	//比较价格
	@Select("select * from hostorder where hoid=#{hoid}")
	List<Hostorder> query(Integer hoid);
	@Insert("INSERT INTO `house`.`hostorder` (`cid`, `checktime`, `leavetime`, `money`, `hid`, `states`, `Orderstime`, `checkouttime`, `price`) VALUES (#{cid}, #{checktime}, #{leavetime}, #{money}, #{hid}, 0, NOW(), '2019-06-24 10:07:55', #{price})")
	Integer addOrder(Hostorder h);
}
