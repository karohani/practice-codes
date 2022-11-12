package com.tobyspring.chapter6;


import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


class HelloTest {

    @Test
    public void test() {
        Hello o = (Hello) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[]{Hello.class},
                new CustomInvocationHandler(new HelloImpl())
        );
        o.sayHello("하이");
    }
}