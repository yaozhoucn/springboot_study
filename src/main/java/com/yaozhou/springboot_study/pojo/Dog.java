package com.yaozhou.springboot_study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by WXHang on HANG at 2021/8/13 11:19
 * Desc：
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Dog {
    @Value("阿黄")
    private String name;
    @Value("3")
    private Integer age;
}
