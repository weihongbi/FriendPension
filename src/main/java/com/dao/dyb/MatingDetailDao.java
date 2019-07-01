package com.dao.dyb;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Matingdetails;
@Mapper
public interface MatingDetailDao {
	@Select(value="select md.*,m.matingName from matingDetails md left join mating m on md.matingId=m.matingId")
	public List<Map<String,Object>> queryAll();
	@Select(value="select * from matingDetails where matingid=#{matingid}")
	public List<Matingdetails> queryById(Integer matingid);
	@Insert(value="insert into matingDetails (mdId,matingDetails,matingId) "
			+ "	values (null,#{matingDetails},#{matingId})")
	public Integer add(Matingdetails md);
	@Delete(value="delete from matingDetails where mdId=#{mdid}")
	public Integer del(Integer mdid);
	
	
	
	@Select(value="select * from matingDetails where matingid=1")
	public List<Matingdetails> list1();
	@Select(value="select * from matingDetails where matingid=2")
	public List<Matingdetails> list2();
	@Select(value="select * from matingDetails where matingid=3")
	public List<Matingdetails> list3();
	@Select(value="select * from matingDetails where matingid=4")
	public List<Matingdetails> list4();
	@Select(value="select * from matingDetails where matingid=5")
	public List<Matingdetails> list5();
}
