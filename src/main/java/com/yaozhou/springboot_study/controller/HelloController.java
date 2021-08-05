package com.yaozhou.springboot_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WXHang on HANG at 2021/8/5 15:19
 * Desc：
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld(){
        return "helloWorld,helloSpring";
    }
}
