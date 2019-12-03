package com.greetingtech.dubbo.demo.consumer;

import com.greetingtech.dubbo.demo.common.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author greetingtech
 * @date 2019-12-02
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        int sum = 0;
        for (int i = 0; i < 10; ++i) {
            sum = demoService.add(i, sum);
            System.out.println(sum);
        }
    }

}
