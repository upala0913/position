package com.wong.upala.controller;

import com.wong.upala.service.AddDataService;
import com.wong.upala.utils.JsonUtils;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author upala
 */

@RequestMapping("/upload")
@RestController
@Log4j2
public class AddController {

    @Autowired
    private AddDataService addDataService;

    /**
     * 导入数据
     * @return 返回值
     */
    @RequestMapping(value = "/addData", method = RequestMethod.POST)
    public Map<String, Object> addData(@RequestBody String param) {
        Map<String, Object> map = JsonUtils.stringToJson(param);
        log.info("参数：{}", map);
        return addDataService.addData(map);
    }

    /**
     * 查询数据
     * @param param 入参
     * @return 返回值
     */
    @RequestMapping(value = "/queryProvince", method = RequestMethod.POST)
    public Map<String, Object> queryProvince(@RequestBody String param) {
        Map<String, Object> data = JsonUtils.stringToJson(param);
        Integer parentId = Integer.parseInt(data.get("parentId").toString());
        return addDataService.queryProvince(parentId);
    }

}
