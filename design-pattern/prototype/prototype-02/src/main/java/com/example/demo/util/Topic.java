package com.example.demo.util;

import java.util.Map;

/**
 * @Author: zhoujing
 * @Date: 2025/2/5 16:15
 * @Description:
 */
public class Topic {

    private Map<String, String> option;
    private String key;

    public Topic() {}

    public Topic(Map<String, String> option, String key) {
        this.option = option;
        this.key = key;
    }

    public Map<String, String> getOption() {
        return option;
    }

    public void setOption(Map<String, String> option) {
        this.option = option;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
