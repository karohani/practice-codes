package com.tobyspring.chapter6.aop.aspect;

import com.tobyspring.chapter6.aop.annotation.VisionSpringAnnotation;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect {

    // @Pointcut => @Before => @After
    // @Around

    @Around("@annotation(com.tobyspring.chapter6.aop.annotation.VisionSpringAnnotation)")
    public Object doSomeThing(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // ****
        System.out.println("BEFORE!!!!!");
        Object ret = proceedingJoinPoint.proceed(); // ByteCode 실행하기 위한 ByteCode interface를 제공한다.
        System.out.println("AFTER!!!!!!");
        // ***
        return ret;
    }
}
