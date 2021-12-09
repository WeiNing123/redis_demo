package com.wn.demo.controller;

import com.wn.demo.common.base.BaseController;
import com.wn.demo.model.SysUser;
import com.wn.demo.service.ISysUserService;
import com.wn.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SysUserController extends BaseController {

    @Autowired
    private ISysUserService sysUserService;

    @GetMapping("/info")
    public R info () {
        SysUser user = new SysUser();
        user.setUserCode((String) getRedisUtil().get("user_code"));
        SysUser info = sysUserService.getOne(sysUserService.getQueryWrapper(user));
        return R.ok().put("data", info);
    }
}
