package com.tobyspring.chapter6.aop;

import com.tobyspring.chapter6.aop.aspect.ExampleAspect;
import com.tobyspring.chapter6.service.CustomAnnotationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.ComponentScan;


@SpringBootTest
@ComponentScan("com.tobyspring.chapter6")
public class AopTestCode {

    @Autowired
    CustomAnnotationService service;

    @Test
    public void getBeanAndCall() {

        service.save();
    }
}
