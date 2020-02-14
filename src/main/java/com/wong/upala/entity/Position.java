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

    private int id;
    private String name;
    private int parentid;
    private String parentname;
    private String areacode;
    private String zipcode;
    private int depth;

}
