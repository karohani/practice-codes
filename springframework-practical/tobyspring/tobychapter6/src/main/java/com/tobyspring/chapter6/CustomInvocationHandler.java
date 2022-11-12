package com.tobyspring.chapter6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {

    private final Object target;

    public CustomInvocationHandler(Hello hello) {
        this.target = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object ret = method.invoke(target, args);
        if( ret instanceof String) {
            System.out.println( "Proxy에 의해서 출력된 Return Log : " + ret);
            return ret;
        } else {
            return null;
        }
    }
}
