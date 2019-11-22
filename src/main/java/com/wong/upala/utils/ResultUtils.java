package com.wong.upala.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/********************************
 *  @program position
 *  @author upala
 *  @version 0.0.1
 *  @since 2019-11-22 15:13
 *  @description
 ********************************/

public class ResultUtils {

    public static Map<String, Object> resultData (String message, int status, Object data) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        map.put("status", status);
        map.put("data", data);
        return map;
    }

    public static Map<String, Object> getData(String param) {
        JSONObject jsonObject = JSONObject.parseObject(param);
        Map<String, Object> map = new HashMap<>();
        map.putAll(jsonObject);
        return map;
    }

}
