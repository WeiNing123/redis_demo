package com.wn.demo.controller;

import com.wn.demo.common.base.BaseController;
import com.wn.demo.model.SysUser;
import com.wn.demo.service.ISysUserService;
import com.wn.utils.MD5;
import com.wn.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController extends BaseController {

    @Autowired
    private ISysUserService sysUserService;

    @PostMapping("/login")
    public R login(@RequestBody SysUser sysUser) throws Exception{
        sysUser.setPassword("{MD5}" + MD5.BASE64AndMD5(MD5.Md5(sysUser.getPassword())));
        SysUser info = sysUserService.getOne(sysUserService.getQueryWrapper(sysUser));
        if (info == null) return R.error(301, "用户名或密码错误");
        getRedisUtil().set("user_code", info.getUserCode());
        return R.ok().put("data", info);
    }
}
