package com.controller.whb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {
    @RequestMapping("loginhtml")
    public String loginhtml(){
        return "back/login";
    }
    @RequestMapping("mainhtml")
    public String mainhtml(){
        return "back/main";
    }
    @RequestMapping("queryEmp")
    public String queryEmp(){
        return "back/queryEmp";
    }
    @RequestMapping("queryApart")
    public String queryApart(){
        return "back/queryApart";
    }
    @RequestMapping("queryhtype")
    public String queryhtype(){
        return "back/houseType";
    }
    @RequestMapping("queryRent")
    public String queryRent(){
        return "back/Rent";
    } 
    @RequestMapping("queryUsershtml")
    public String queryUsershtml(){
        return "back/queryUsers";
    }
    @RequestMapping("rolsManagerhtml")
    public String rolsManagerhtml(){
        return "back/rolsManager";
    } 
    @RequestMapping("housewhtml")
    public String housewhtml(){
        return "back/housew";
    }    
    @RequestMapping("recordhtml")
    public String recordhtml(){
        return "back/record";
    }
    @RequestMapping("hostorderhtml")
    public String hostorderhtml1(){
        return "back/hostorder";
    }
    @RequestMapping("tiorderhtml")
    public String tiorderhtml(){
        return "front/tiorder";
    }
    
    
    @RequestMapping("fangwuqinghtml")
    public String fangwuqinghtml(){
        return "front/fangwuxiangqing";
    }
}
