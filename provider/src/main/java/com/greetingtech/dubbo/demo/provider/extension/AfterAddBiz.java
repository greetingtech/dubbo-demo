package com.greetingtech.dubbo.demo.provider.extension;

/**
 * @author greetingtech
 * @date 2019-12-04
 */
public class AfterAddBiz implements Biz {

    @Override
    public void doSomething() {
        System.out.println("afterAddBiz.doSomething()");
    }
}
