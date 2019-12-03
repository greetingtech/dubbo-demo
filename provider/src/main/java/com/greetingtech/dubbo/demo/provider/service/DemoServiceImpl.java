package com.greetingtech.dubbo.demo.provider.service;

import com.greetingtech.dubbo.demo.common.api.DemoService;

/**
 * @author guoyiting
 * @date 2019-12-03
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

}
