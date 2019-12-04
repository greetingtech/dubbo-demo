package com.greetingtech.dubbo.demo.provider.extension;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author greetingtech
 * @date 2019-12-04
 */
@SPI
public interface Biz {

    void doSomething();

}
