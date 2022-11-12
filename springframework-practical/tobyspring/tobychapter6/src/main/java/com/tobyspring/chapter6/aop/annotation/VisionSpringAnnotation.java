package com.tobyspring.chapter6.aop.annotation;

import lombok.Getter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface VisionSpringAnnotation {

    // compile => @annotation 정보는 주석이기 때문에 RUNTIME의 클래스파일에서는 지워집니다.
    // RUNTIME까지 정보가 써져야 하느데
}
