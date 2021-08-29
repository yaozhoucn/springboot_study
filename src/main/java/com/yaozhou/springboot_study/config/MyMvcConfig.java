package com.yaozhou.springboot_study.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by WXHang on HANG at 2021/8/27 17:57
 * Desc：
 *
 *
 * 如果我们要扩展springmvc，官方建议我们这么去做
 * 扩展springmvc的配置
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //用于扩展mvc
    //添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }

    /**
     * 增加视图跳转
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/yaoshen").setViewName("index");

    }
}
