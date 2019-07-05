package com.dao.lah;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface lahhouseDao {
	
	List<Map<String,Object>> queryId(Integer id);
	List<Map<String,Object>> queryAll();
	List<Map<String,Object>> queryOrder();
	List<Map<String,Object>> queryOrderByid(Integer oid);
	List<Map<String,Object>> queryOrderid(Integer hoid);
	Integer upstates(Integer hoid);
	Integer deloid(Integer hoid);

}
