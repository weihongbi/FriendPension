package com.controller.lah;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class lahHtmlController {
	@RequestMapping("fangwuhtml")
    public String fangwuhtml(){
        return "front/fangwu";
    }
}
