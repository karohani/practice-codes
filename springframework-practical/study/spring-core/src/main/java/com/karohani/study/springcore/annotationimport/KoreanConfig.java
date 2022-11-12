package com.karohani.study.springcore.annotationimport;

import javax.annotation.PostConstruct;

public class KoreanConfig {

    @PostConstruct
    public void check() {
        System.out.println("KOREAN CONFIG");
    }
}
