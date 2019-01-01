package cn.net.arven.gateway.config;

import cn.net.arven.gateway.interceptor.GatewayInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AdaptorConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private GatewayInterceptor gatewayInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定义拦截器，添加拦截路径和排除拦截路径
        registry.addInterceptor(gatewayInterceptor).addPathPatterns("/**");
    }



}
