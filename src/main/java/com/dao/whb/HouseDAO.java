package com.dao.whb;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.Homephoto;
import com.entity.House;
@Mapper
public interface HouseDAO {
	@Select("select h.*,hp.* from house h LEFT JOIN homephoto hp on h.hpid = hp.hpid where states=0")
	public List<Map<String,Object>> query();
	@Update("UPDATE `house`.`house` SET `states`= 1 WHERE (`hid`=#{hid})")
	Integer uphouse(Integer hid);
	@Select("select * from homephoto where hpid =(select hpid from house where hpid= #{hpid})")
	public List<Homephoto> queryPhoto(Integer hpid);
}
