package com.dao.lah;

import com.entity.Housetype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface hourseTypeDao {
    public List<Housetype> query();
    int doadd(Housetype ht);
    int doupd(Housetype ht);
    Housetype getid(Integer id);
    int del(Integer id);
}
