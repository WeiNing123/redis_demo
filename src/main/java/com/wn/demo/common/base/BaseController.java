package com.wn.demo.common.base;

import com.wn.demo.common.utils.RedisUtil;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class BaseController {

    @Autowired
    private RedisUtil redisUtil;
}
