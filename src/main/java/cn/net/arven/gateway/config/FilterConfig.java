package cn.net.arven.gateway.config;

import cn.net.arven.gateway.filter.MyFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 宋建华
 * @date 2019-03-25 14:51
 **/
@Configuration
public class FilterConfig {
    @Bean
    public MyFilter myFilter() {
        MyFilter myFilter = new MyFilter();
        return myFilter;
    }
}
