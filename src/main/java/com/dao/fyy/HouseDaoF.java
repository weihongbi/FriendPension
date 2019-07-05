package com.dao.fyy;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface HouseDaoF {
	@Select("select h.*,hp.parlor,p.price,c.cname,c.picture,ci.city from house h \r\n" + 
			"LEFT JOIN homedetails hd on h.homedid=hd.homedid \r\n" + 
			"LEFT JOIN pricerule p on hd.pruleId=p.pruleId \r\n" + 
			"LEFT JOIN homephoto hp on h.hpid=hp.hpid \r\n" + 
			"LEFT JOIN mating m on h.matingId = m.matingId \r\n" + 
			"LEFT JOIN rule r ON h.ruleid = r.ruleid \r\n" + 
			"LEFT JOIN customers c on h.cid = c.cid "+
			"LEFT JOIN cities ci on hd.cityid = ci.cityid ")
	public List<Map<String,Object>> queryhouse();
	
	@Select("select h.*,hp.parlor,p.price,c.cname,c.picture from house h \r\n" + 
			"LEFT JOIN homedetails hd on h.homedid=hd.homedid \r\n" + 
			"LEFT JOIN pricerule p on hd.pruleId=p.pruleId \r\n" + 
			"LEFT JOIN homephoto hp on h.hpid=hp.hpid \r\n" + 
			"LEFT JOIN mating m on h.matingId = m.matingId \r\n" + 
			"LEFT JOIN rule r ON h.ruleid = r.ruleid \r\n" + 
			"LEFT JOIN customers c on h.cid = c.cid where hid = #{hid}")
	public List<Map<String,Object>> queryByhid(int hid);
}
