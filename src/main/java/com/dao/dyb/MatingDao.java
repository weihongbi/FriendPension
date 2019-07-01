package com.dao.dyb;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.Mating;
@Mapper
public interface MatingDao {
	@Select(value = "select * from mating")
	public List<Mating> queryAll();
	@Insert(value = "insert into mating (matingId,matingName) values(#{matingId},#{matingName})")
	public Integer add(Mating m);
	@Delete(value="delete from mating where matingId=#{matingId}")
	public Integer del(Integer id);
	@Update(value="update mating set matingName=#{matingName} where matingId=#{matingId}")
	public Integer update(Mating m);
}
