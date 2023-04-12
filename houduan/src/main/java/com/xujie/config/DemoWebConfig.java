package com.xujie.config;

import com.xujie.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description: web配置
 **/
@Configuration
public class DemoWebConfig implements WebMvcConfigurer {


    /**
     * 拦截器配置
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/api/**")
                //放行路径，可以添加多个
                .excludePathPatterns("/api/login");
    }
}