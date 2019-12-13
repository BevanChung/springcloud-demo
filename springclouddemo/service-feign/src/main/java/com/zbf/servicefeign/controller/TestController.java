package com.zbf.servicefeign.controller;

import com.zbf.servicefeign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author 创建者
 * @author 修改者
 * @version 2019/12/10 17:15
 * @since 2019/12/10 17:15
 */
@RestController
public class TestController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    TestService testService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return testService.sayHiFromClientOne(name);
    }
}
