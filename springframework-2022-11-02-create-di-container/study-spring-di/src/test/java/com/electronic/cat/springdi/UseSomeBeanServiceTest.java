package com.electronic.cat.springdi;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UseSomeBeanServiceTest {

    @Test
    public void 자동생성_TEST() {

        // ApplicationContext
        // AnotationConfig, XMLConfig
        // GenericApplicationContext
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainApplication.class); // class로부터 하위 클래스를 Component Scan
        // @Compoent과 @Bean의 차이점
        SomeBeanConfiguration bean = annotationConfigApplicationContext.getBean(SomeBeanConfiguration.class);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!! bean : [ " + bean.toString() + " ] !!!!!!!!!!!!!!!!!!!!!!!!");
        SomeBean bean2 = annotationConfigApplicationContext.getBean(SomeBean.class);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!! bean : [ " + bean2.toString() + " ] !!!!!!!!!!!!!!!!!!!!!!!!");
//        !!!!!!!!!!!!!!!!!!!!!!! bean : [ com.electronic.cat.springdi.SomeBeanConfiguration$$EnhancerBySpringCGLIB$$3fe638f2@2c30b71f ] !!!!!!!!!!!!!!!!!!!!!!!!
    }

}