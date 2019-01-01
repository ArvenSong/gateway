package cn.net.arven.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Configuration
@ConfigurationProperties(prefix = "config.model")
public class ModelConfig {
    private List<Map<String, String>> modelList = new ArrayList<>();

    public List<Map<String, String>> getModelList() {
        return modelList;
    }

    public void setModelList(List<Map<String, String>> modelList) {
        this.modelList = modelList;
    }
}

