package cn.net.arven.gateway.interceptor;

import cn.hutool.json.JSONUtil;
import cn.net.arven.gateway.config.ModelConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Component
public class GatewayInterceptor implements HandlerInterceptor {
    @Autowired
    private ModelConfig modelConfig;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        System.err.println("-------------------begin---------------------");
        if (request.getHeader(HttpHeaders.ORIGIN) != null) {
            String origin = request.getHeader("Origin");
            response.addHeader("Access-Control-Allow-Origin", origin);
            response.addHeader("Access-Control-Allow-Credentials", "true");
            response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT,PATCH, HEAD");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type");
            response.addHeader("Access-Control-Max-Age", "3600");
        }

        return true;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
//        List<Map<String, String>> modelList = modelConfig.getModelList();
        StringBuffer requestURL = request.getRequestURL();
//        String s = JSONUtil.toJsonStr(httpServletRequest);
//        System.err.println(s);
        System.err.println(requestURL);
//        System.err.println(modelList);

        request.getRequestDispatcher("http://www.baidu.com").forward(request,response);
//        if(!httpServletRequest.getServletPath().equals("/aa")) {
//            httpServletRequest.getRequestDispatcher("/aa").forward(httpServletRequest,httpServletResponse);
//        }

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {
        System.err.println("-------------------end---------------------");
    }
}
