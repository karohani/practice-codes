package com.tobyspring.chapter6;

public class HelloImpl implements Hello {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }

    @Override
    public String sayHi(String name) {
        return "HI " + name;
    }

    @Override
    public String sayThankYou(String name) {
        return "Thank You " + name;
    }
}
