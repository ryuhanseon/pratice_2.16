package com.mysite.shop.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    @GetMapping("/product")
    @ResponseBody
    public String product(){
        return "product";
    }
}
