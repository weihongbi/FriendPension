package com.dao.lah;

import com.entity.Apartments;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface ApartmentDAO {
	@Select("SELECT * from apartments")
    List<Apartments> query();
	@Insert("INSERT INTO `house`.`apartments` (`bedroom`, `parlor`, `toilet`, `cookhouse`, `balcony`)"
			+ " VALUES (#{bedroom},#{parlor}, #{toilet}, #{cookhouse}, #{balcony})")
    int doadd(Apartments a);
}
