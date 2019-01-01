package cn.net.arven.gateway.Controller;

import cn.net.arven.gateway.config.ModelConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * 请求转发
 *
 * @author 宋建华
 * @date 2018-12-28 17:01
 **/
@Controller
public class AdaptorController {
    @Autowired
    private ModelConfig modelConfig;

    @RequestMapping("/aa")
    public String adapt() {
        List<Map<String, String>> modelList = modelConfig.getModelList();
        System.err.println(modelList);
        return "index";
    }
}
