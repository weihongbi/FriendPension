package com.service.whb;

import com.dao.whb.UsersDAO;
import com.entity.Users;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UsersService {
    @Resource
    UsersDAO dao;
    
    public List<Users> find(String uname){
        return dao.find(uname);
    }
    public Integer delUsers(Integer empid) {
    	return dao.delUsers(empid);
    }
    public List<Map<String,Object>> queryUsers(){
    	return dao.queryUsers();
    }
    public Integer addUsers(Users u) {
    	return dao.addUsers(u);
    }
}
