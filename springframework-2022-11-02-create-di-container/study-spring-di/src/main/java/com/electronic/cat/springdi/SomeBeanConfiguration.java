package com.electronic.cat.springdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// Factory Bean
// Bean을 반드는 Fatory Method를 가지고 있는 Bean
@Configuration
public class SomeBeanConfiguration {

//    @Bean
//    public SomeBean someBean1() {
//        System.out.println("!!!!!!!!!!!! Factory Bean을 통해서 SomeBean1을 등록 !!!!!!!!!!!!!!!!!!!!");
//        return new SomeBean();
//    }
//
//    @Bean
//    public SomeBean someBean2() {
//        System.out.println("!!!!!!!!!!!! Factory Bean을 통해서 SomeBean2을 등록 !!!!!!!!!!!!!!!!!!!!");
//        return new SomeBean();
//    }


    @Bean
    public SomeBean someBean1() {
        System.out.println("!!!!!!!!!!!! Factory Bean을 통해서 SomeBean1을 등록 !!!!!!!!!!!!!!!!!!!!");
        return new SomeBean();
    }

//    @Bean
//    public SomeBean someBean2() {
//        System.out.println("!!!!!!!!!!!! Factory Bean을 통해서 SomeBean2을 등록 !!!!!!!!!!!!!!!!!!!!");
//        return this.someBean1();
////        return new SomeBean();
//    }
}
