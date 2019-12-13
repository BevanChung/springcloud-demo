package com.zbf.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author 创建者
 * @author 修改者
 * @version 2019/12/11 17:25
 * @since 2019/12/11 17:25
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
