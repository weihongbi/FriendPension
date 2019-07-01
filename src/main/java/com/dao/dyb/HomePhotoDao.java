package com.dao.dyb;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.Homephoto;
@Mapper
public interface HomePhotoDao {
	@Select(value="select * from homePhoto")
	public List<Homephoto> queryAll();
	@Insert(value="INSERT INTO `house`.`homephoto`(`hpid`, `bedroom`, `parlor`, `toilet`, `cookhouse`, `rests`) VALUES (null, #{bedroom}, #{parlor}, #{toilet}, #{cookhouse}, #{rests})")
	public Integer add(Homephoto h);
	@Select(value="SELECT max(hpid) FROM `homephoto`")
	public Integer getById();
	@Update(value="update homephoto set parlor=#{parlor} where hpid=#{hpid}")
	public Integer updateParlor(@Param("parlor")String parlor,@Param("hpid")Integer hpid);
	
	@Update(value="update homephoto set toilet=#{toilet} where hpid=#{hpid}")
	public Integer updateToilet(@Param("toilet")String toilet,@Param("hpid")Integer hpid);
	
	@Update(value="update homephoto set cookhouse=#{cookhouse} where hpid=#{hpid}")
	public Integer updateCookhouse(@Param("cookhouse")String cookhouse,@Param("hpid")Integer hpid);
	
	@Update(value="update homephoto set rests=#{rests} where hpid=#{hpid}")
	public Integer updateRests(@Param("rests")String rests,@Param("hpid")Integer hpid);
	
}
