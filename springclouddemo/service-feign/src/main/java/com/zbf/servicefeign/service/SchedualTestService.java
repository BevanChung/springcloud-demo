package com.zbf.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author 创建者
 * @author 修改者
 * @version 2019/12/11 15:57
 * @since 2019/12/11 15:57
 */
@Component
public class SchedualTestService implements TestService{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
