package com.xxx.proj.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class TimeInterceptorConfig extends WebMvcConfigurerAdapter {

    //拦截器1
    @Autowired
    private LoginInterceptor timeInterceptor;

    //拦截器2
    @Autowired
    private LoginInterceptor timeTwoInterceptor;


    /**
     * 添加自定义拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        /*InterceptorRegistration timeTwo = registry.addInterceptor(timeTwoInterceptor);*/
        InterceptorRegistration time = registry.addInterceptor(timeInterceptor);
        //配置拦截路径
       /* timeTwo.addPathPatterns("/*");*/
        time.addPathPatterns("/**");
        //忽略拦截路径
       /* timeTwo.excludePathPatterns("/sports/emp/login");*/
        time.excludePathPatterns("/emp/login");
       /* time.excludePathPatterns("/sports/home");*/
        time.excludePathPatterns("/");
        time.excludePathPatterns("/index.html");
        time.excludePathPatterns("/app*/**");
       
    }
}
