package com.dao.whb;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Homestate;

@Mapper
public interface HomestateDAO {
	@Insert("INSERT INTO `house`.`homestate` (`checkintime`, `leavetime`, `hid`, `cid`) VALUES (#{checkintime}, #{leavetime}, #{hid}, #{cid})")
	Integer homeAdd(Homestate h);
	@Delete("delete from homestate where sid=#{sid}")
	Integer homeDel(Integer sid);
	@Select("select * from homestate where checkintime<'2019-07-05' AND leavetime>'2019-07-05' AND hid=#{hid}")
	List<Homestate> query(Integer hid);
}
