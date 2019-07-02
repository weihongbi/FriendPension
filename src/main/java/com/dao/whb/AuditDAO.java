package com.dao.whb;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Audit;
@Mapper
public interface AuditDAO {
	@Insert("INSERT INTO `house`.`audit` (`hid`,`cid`, `optime`, `res`) VALUES (#{hid}, #{cid}, NOW(), #{res})")
	Integer add(Audit a);
	@Select("select * from audit where hid =#{hid}")
	List<Audit> queryaudit(Integer hid); 
}
