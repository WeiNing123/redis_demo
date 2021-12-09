package com.wn.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wn.demo.model.SysUser;

public interface ISysUserService extends IService<SysUser> {
    QueryWrapper<SysUser> getQueryWrapper(SysUser sysUser);
}
