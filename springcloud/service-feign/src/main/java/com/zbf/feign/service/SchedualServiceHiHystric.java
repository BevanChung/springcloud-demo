package com.zbf.feign.service;

import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/5 15:16
 * @version 1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
