package com.wong.upala.utils;

import com.alibaba.fastjson.JSONObject;
import com.wong.upala.commons.FinalVariable;

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

    // 返回集合
    private static Map<String, Object> resultMap = new HashMap<>(FinalVariable.HASH_SIZE);

    /**
     * 成功返回信息
     * @param message 返回信息
     * @param data 返回的数据
     * @param code 返回标识码
     * @return 返回map集合
     */
    public static Map<String, Object> resultSuccessData (String message, int code, Object data) {
        resultMap.put("message", message);
        resultMap.put("status", FinalVariable.RESULT_SUCCESS);
        resultMap.put("code", code);
        resultMap.put("data", data);
        return resultMap;
    }

    /**
     * 失败返回信息
     * @param message 返回信息
     * @param code 返回标识码
     * @return 返回map集合
     */
    public static Map<String, Object> resultFailData (String message, int code) {
        resultMap.put("message", message);
        resultMap.put("status", FinalVariable.RESULT_FAIL);
        resultMap.put("code", code);
        return resultMap;
    }

    /**
     * 成功返回没有数据的信息
     * @param message 返回信息
     * @param code 返回标识码
     * @return 返回map集合
     */
    public static Map<String, Object> resultSuccessNullData (String message, int code) {
        resultMap.put("message", message);
        resultMap.put("status", FinalVariable.RESULT_SUCCESS);
        resultMap.put("code", code);
        return resultMap;
    }

    public static Map<String, Object> getData(String param) {
        JSONObject jsonObject = JSONObject.parseObject(param);
        Map<String, Object> map = new HashMap<>();
        map.putAll(jsonObject);
        return map;
    }

}
