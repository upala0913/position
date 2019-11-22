package com.wong.upala.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wong.upala.commons.FinalVariable;
import com.wong.upala.entity.Position;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/********************************
 *  @program position
 *  @author upala
 *  @version 0.0.1
 *  @since 2019-11-22 13:58
 *  @description
 ********************************/

public class JsonUtils {

    /**
     * 将字符串转换为map集合
     * @param param 入参
     * @return 返回值
     */
    public static Map<String, Object> stringToJson(String param) {
        Map<String, Object> map = new HashMap<>(FinalVariable.HASH_SIZE);
        JSONObject jsonObject = JSON.parseObject(param);
        map.putAll(jsonObject);
        return map;
    }

    /**
     * 字符串转换list集合
     * @param param 入参
     * @return 返回值
     */
    public static List<Position> strArrayToJson(String param) {
        return JSON.parseArray(param, Position.class);
    }

}
