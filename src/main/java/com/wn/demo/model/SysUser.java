package com.wn.demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("sys_user")
@Data
public class SysUser {

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    //部门id
    private Integer departmentId;
    //密码
    private String password;
    //联系方式
    private String phone;
    //性别
    private Integer sex;
    //用户名
    private String userCode;
    //用户姓名
    private String userName;
    //邮箱
    private String mail;
    //添加时间
    private Date addTime;
    //用户类型
    private String type;
}
