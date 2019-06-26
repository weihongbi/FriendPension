package com.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import com.entity.Navigation;

import java.util.List;



@Mapper
public interface NavigationDao {		
	List<Navigation> queryAll();
	@Select("select * from navigation")
	List<Navigation> query();
	List<Navigation> queryByRid(Integer rid);
	@Select("SELECT group_concat(nid) nid FROM r_n WHERE rid=#{rid}")
	String queryRids(Integer rid);
}
