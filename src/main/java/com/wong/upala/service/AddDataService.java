package com.wong.upala.service;

import java.util.Map;

/********************************
 *  @program position
 *  @author upala
 *  @version 0.0.1
 *  @since 2019-11-22 14:50
 *  @description
 ********************************/
public interface AddDataService {

    Map<String, Object> addData(Map<String, Object> param);

    Map<String, Object> queryProvince(Integer parentId);

}
