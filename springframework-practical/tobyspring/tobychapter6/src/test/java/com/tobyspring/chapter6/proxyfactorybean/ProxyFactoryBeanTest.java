package com.tobyspring.chapter6.proxyfactorybean;

import com.tobyspring.chapter6.HelloImpl;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import java.util.Locale;

public class ProxyFactoryBeanTest {

    @Test
    public void create_proxy_factory_bean() {
        ProxyFactoryBean proxyFactory = new ProxyFactoryBean();
        proxyFactory.setTarget(new HelloImpl());
        proxyFactory.addAdvice(new UppercaseAdvice());
    }

    @Test
    public void pointCutAdvice() {
        ProxyFactoryBean proxyFactory = new ProxyFactoryBean();
        NameMatchMethodPointcut nameMatchMethodPointcut = new NameMatchMethodPointcut();
        nameMatchMethodPointcut.setMappedName("sayHello");
        proxyFactory.setTarget(new HelloImpl());
        proxyFactory.addAdvisor(new DefaultPointcutAdvisor(nameMatchMethodPointcut, new UppercaseAdvice()));
        Object object = proxyFactory.getObject();
    }

    public static class UppercaseAdvice implements MethodInterceptor {

        @Override
        public Object invoke(MethodInvocation invocation) throws Throwable {
            String proceed = (String) invocation.proceed();
            return proceed.toUpperCase(Locale.ROOT);
        }
    }
}
