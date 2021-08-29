package com.yaozhou.springboot_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;


/**
 * Created by WXHang on HANG at 2021/8/5 15:19
 * Desc：
 * @author HANG
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld(){
        return "helloWorld,helloSpring";
    }

    @RequestMapping("/hello2")
    public String helloIndex(Model model){
        model.addAttribute("msg","尧神牛叉");
        model.addAttribute("msg2", Arrays.asList("尧舟","尧神"));
        return "index";
    }
}
