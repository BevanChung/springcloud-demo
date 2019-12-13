package com.zbf.scfgatewayfirstsight.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Description:
 *
 * @author 创建者
 * @author 修改者
 * @version 2019/12/12 17:06
 * @since 2019/12/12 17:06
 */
@RestController
public class TestController {

    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback");
    }

}
