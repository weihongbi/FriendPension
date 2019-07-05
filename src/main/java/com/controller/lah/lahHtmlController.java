package com.controller.lah;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class lahHtmlController {
	
	@RequestMapping("fangdonghtml")
    public String fangdonghtml(){
        return "front/FangDong";
    }
	
}
