package com.dao.whb;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HostorderDAO {
	@Select("select ho.*,c.cname,c.phone from hostorder ho LEFT JOIN customers c on ho.cid = c.cid")
	List<Map<String,Object>> queryO();
}
