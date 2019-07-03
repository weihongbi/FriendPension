package com.dao.fyy;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.Hostorder;

@Mapper
public interface HostorderDaoF {
	
	@Select("SELECT ho.*,os.oname,h.hname,hp.parlor,h.cid,c.cname,c.phone,(select cname from customers where cid = (select cid from house WHERE hid =h.hid)) dd from hostorder ho\r\n" + 
			"LEFT JOIN orderstate os\r\n" + 
			"on ho.states = os.oid\r\n" + 
			"LEFT JOIN house h\r\n" + 
			"on ho.hid = h.hid\r\n" + 
			"LEFT JOIN homephoto hp\r\n" + 
			"on h.hpid = hp.hpid\r\n" + 
			"LEFT JOIN customers c\r\n" + 
			"on ho.cid = c.cid\r\n" + 
			"where c.cid in (select cid from house)")
	public List<Map<String,Object>> queryhorder();
	
	
	@Select("SELECT ho.*,os.oname,h.hname,hp.parlor,h.cid,c.cname,c.phone,(select cname from customers where cid = (select cid from house WHERE hid =h.hid)) dd from hostorder ho\r\n" + 
			"LEFT JOIN orderstate os\r\n" + 
			"on ho.states = os.oid\r\n" + 
			"LEFT JOIN house h\r\n" + 
			"on ho.hid = h.hid\r\n" + 
			"LEFT JOIN homephoto hp\r\n" + 
			"on h.hpid = hp.hpid\r\n" + 
			"LEFT JOIN customers c\r\n" + 
			"on ho.cid = c.cid\r\n" + 
			"where c.cid in (select cid from house) and hoid=#{hoid}")
	public List<Map<String,Object>> queryByhoid(Integer hoid);
	
	
	@Select("SELECT ho.*,os.oname,h.hname,hp.parlor,h.cid,c.cname,c.phone,(select cname from customers where cid = (select cid from house WHERE hid =h.hid)) dd from hostorder ho\r\n" + 
			"LEFT JOIN orderstate os\r\n" + 
			"on ho.states = os.oid\r\n" + 
			"LEFT JOIN house h\r\n" + 
			"on ho.hid = h.hid\r\n" + 
			"LEFT JOIN homephoto hp\r\n" + 
			"on h.hpid = hp.hpid\r\n" + 
			"LEFT JOIN customers c\r\n" + 
			"on ho.cid = c.cid\r\n" + 
			"where c.cid in (select cid from house) AND oid = #{oid}")
	public List<Map<String,Object>> querystates(Integer oid);
	
	
	@Update("UPDATE hostorder SET states=5 WHERE hoid=#{hoid}")
	public int upstates(Integer hoid);
	
	
	@Delete("DELETE from hostorder where hoid = #{hoid}")
	public int delhorder(int hoid);
}
