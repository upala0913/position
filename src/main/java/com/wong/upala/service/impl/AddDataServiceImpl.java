package com.wong.upala.service.impl;

import com.wong.upala.entity.Position;
import com.wong.upala.mapper.AddDataMapper;
import com.wong.upala.service.AddDataService;
import com.wong.upala.utils.JsonUtils;
import com.wong.upala.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/********************************
 *  @program position
 *  @author upala
 *  @version 0.0.1
 *  @since 2019-11-22 14:51
 *  @description
 ********************************/

@Service
public class AddDataServiceImpl implements AddDataService {

    @Autowired
    private AddDataMapper addDataMapper;

    /**
     * 添加数据
     * @param param 入参
     * @return 返回值
     */
    @Override
    public Map<String, Object> addData(Map<String, Object> param) {
        String result = param.get("result").toString();
        List<Position> positions = JsonUtils.strArrayToJson(result);
        System.out.println(positions);
        Integer res = addDataMapper.addData(positions);
        if (res <= 0)
            return ResultUtils.resultData("添加数据失败", 1000, null);
        return ResultUtils.resultData("添加数据成功", 200, res);
    }

    /**
     * 查询数据
     * @param parentId 上级ID
     * @return 返回值
     */
    @Override
    public Map<String, Object> queryProvince(Integer parentId) {
        List<LinkedHashMap> linkedHashMaps = addDataMapper.queryProvince(parentId);
        if (linkedHashMaps == null || linkedHashMaps.size() == 0)
            return ResultUtils.resultData("没有该数据", 1001, null);
        return ResultUtils.resultData("查询数据成功", 200, linkedHashMaps);
    }

}
