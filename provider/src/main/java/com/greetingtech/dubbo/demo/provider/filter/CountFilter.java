package com.greetingtech.dubbo.demo.provider.filter;

import com.alibaba.dubbo.rpc.*;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author greetingtech
 * @date 2019-12-04
 */
public class CountFilter implements Filter {

    private AtomicInteger counter = new AtomicInteger(0);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        int count = counter.incrementAndGet();
        System.out.println(invoker.getUrl());
        System.out.println(count);
        System.out.println(invocation.getMethodName());
        Result result = invoker.invoke(invocation);
        return result;
    }

}
