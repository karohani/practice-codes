//package com.electronic.cat.springdi;
//
//import org.springframework.context.annotation.Bean;
//
//public class SomeBeanConfigurationProxy extends SomeBeanConfiguration {
//
//    private SomeBeanConfiguration someBeanConfiguration;
//
//    private boolean someBean1Used = false;
//
//    public SomeBeanConfigurationProxy(SomeBeanConfiguration someBeanConfiguration) {
//        this.someBeanConfiguration = someBeanConfiguration;
//    }
//
//    @Override
//    public SomeBean someBean1() {
//        System.out.println("!!!!!!!!!!!! Factory Bean을 통해서 SomeBean1을 등록 !!!!!!!!!!!!!!!!!!!!");
//        if (someBean1Used == true ){
//            return Applicationcontext.find(Somebean);
//        } else {
//            someBean1Used = true;
//            return someBeanConfiguration.someBean1();
//        }
//    }
//
//    @Override
//    public SomeBean someBean2() {
//        System.out.println("!!!!!!!!!!!! Factory Bean을 통해서 SomeBean2을 등록 !!!!!!!!!!!!!!!!!!!!");
//        return someBeanConfiguration.someBean2()
////        return new SomeBean();
//    }
//}
//
////'org.springframework.aop.config.internalAutoProxyCreator'
//// 1 spring aop, dynamic proxy에 대해서 이해하라
//// 2 design pattern에서 proxy pattern, decorator pattern의 차이점과 공통점에 대해서 이해하라.