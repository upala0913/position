package com.wong.upala.entity;

import lombok.Data;

/********************************
 *  @program document
 *  @author upala
 *  @version 0.0.1
 *  @since 2019-11-22 11:53
 *  @description 城市信息实体类
 ********************************/

@Data
public class Position {

    // 城市标识码
    private int id;
    // 城市名称
    private String name;
    // 城市上一级标识码
    private int parentid;
    // 城市上一级名称
    private String parentname;
    // 城市区域标识码
    private String areacode;
    // 城市标准标识码
    private String zipcode;
    // 城市所属
    private int depth;

}
