package com.wong.upala.entity;

import lombok.Data;

import java.util.Date;

/********************************
 *  @program document
 *  @author 王鹏
 *  @since 2020/2/14 20:26
 *  @description 用户管理类
 *  @version 0.0.1
 ********************************/

@Data
public class UserManage {

    // 用户ID
    private String id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 验证密钥
    private String appKeyPos;
    // 验证ID
    private String appIdPos;
    // 创建时间
    private Date createTime;

}
