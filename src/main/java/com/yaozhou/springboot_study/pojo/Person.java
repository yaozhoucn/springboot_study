package com.yaozhou.springboot_study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by WXHang on HANG at 2021/8/13 11:21
 * Desc：
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component

//javaconfig绑定我们配置文件的值，可以采取以下方式(yml + properties)

//使用properties赋值
//@PropertySource("classpath:application.properties")

/**
 * 使用yml给person赋值
 */
@ConfigurationProperties(prefix = "person")
public class Person {
    //spel表达式取出配置文件的值 --- properties
    //@Value("${name}")
    private String name;
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
