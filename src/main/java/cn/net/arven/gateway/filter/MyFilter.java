package cn.net.arven.gateway.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpSession;

/**
 * 自定义过滤器，可以实现在不同的时候进行数据的拦截，分为四种状态
 * 当请求到达服务的时候，
 * 请求进入服务的时候，
 * 请求到达服务之后
 * 错误的时候
 */
public class MyFilter extends ZuulFilter {
    /**
     * 表示返回的类型，就是确定要进行什么样的操作
     *
     * @return
     */
    @Override
    public String filterType() {
        return null;
    }

    /**
     * 设置级别，数字越大级别越低
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 表示是否开启当前的拦截器 false 是不开启， true是开启
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     * 表示执行的代码，比如说请求的时候，进行身份的认证等..
     *
     * @return
     */
    @Override
    public Object run() {
        return null;
    }
}