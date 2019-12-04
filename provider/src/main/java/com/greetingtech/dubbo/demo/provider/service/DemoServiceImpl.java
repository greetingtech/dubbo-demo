package com.greetingtech.dubbo.demo.provider.service;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.greetingtech.dubbo.demo.common.api.DemoService;
import com.greetingtech.dubbo.demo.provider.extension.Biz;

/**
 * @author guoyiting
 * @date 2019-12-03
 */
public class DemoServiceImpl implements DemoService {

    private static Biz biz;

    static {
        ExtensionLoader<Biz> extensionLoader =
                ExtensionLoader.getExtensionLoader(Biz.class);
        biz = extensionLoader.getExtension("AfterAddBiz");
    }

    @Override
    public int add(int a, int b) {
        try {
            return a + b;
        } finally {
            biz.doSomething();
        }
    }

}
