package com.dao.whb;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Transfer;

@Mapper
public interface TransferDAO {
	@Insert("INSERT INTO `house`.`transfer` (`empid`, `operationtime`, `money`, `extractrate`, `price`, `hostmoney`, `cid`, `states`) VALUES (#{empid}, NOW(), #{money}, #{extractrate}, #{price}, #{hostmoney}, #{cid}, 1)")
	Integer add(Transfer t);
	@Select("select * from customers where cid  = (select cid from house where hid =#{hid})")
	List<Transfer> query(Integer hid);
	@Select("select t.*,e.empname,c.cname from transfer t LEFT JOIN employee e on t.empid = e.empid LEFT JOIN customers c on c.cid = t.cid")
	List<Map<String,Object>> queryAll();
}
