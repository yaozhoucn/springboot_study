package com.yaozhou.springboot_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication: 标注这个类是一个springboot的应用；启动类下的所有资源被导入
@SpringBootApplication
public class SpringbootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyApplication.class, args);
    }

}
