package cn.net.arven.gateway.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求转发
 *
 * @author 宋建华
 * @date 2018-12-28 17:01
 **/
@Controller
public class AdaptorController {

    @RequestMapping("/")
    public Object adapt() {

        return "index";
    }
}
