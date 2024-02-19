package com.mysite.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {
    @GetMapping("/main")
    @ResponseBody
    public String test(){
        return "test";
    }
}
