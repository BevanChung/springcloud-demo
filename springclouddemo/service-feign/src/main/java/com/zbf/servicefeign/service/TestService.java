package com.zbf.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description:
 *
 * @author 创建者
 * @author 修改者
 * @version 2019/12/10 17:14
 * @since 2019/12/10 17:14
 */
@FeignClient(value = "service-hi",fallback = SchedualTestService.class)
public interface TestService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
