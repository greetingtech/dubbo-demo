package com.greetingtech.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author greetingtech
 * @date 2019-12-02
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read();
    }

}
