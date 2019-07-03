package com.dao.fyy;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CollectDaoF {
	
	@Select("SELECT c.*,h.hname,p.price,hp.parlor,cu.picture from collect c\r\n" + 
			"LEFT JOIN house h \r\n" + 
			"ON c.hid=h.hid \r\n" + 
			"LEFT JOIN homedetails hd \r\n" + 
			"on h.homedid=hd.homedid \r\n" + 
			"LEFT JOIN pricerule p \r\n" + 
			"on hd.pruleId=p.pruleId \r\n" + 
			"LEFT JOIN homephoto hp \r\n" + 
			"on h.hpid=hp.hpid \r\n" + 
			"LEFT JOIN customers cu \r\n" + 
			"on c.cid=cu.cid where c.cid=#{cid}")
	public List<Map<String,Object>> querycollect(int cid);
	
	@Delete("DELETE from collect where collectid = #{collectid}")
	public int delcollect(int collectid);
}
