package com.karohani.study.springcore.annotationimport;


import javax.annotation.PostConstruct;

public class EnglishConfig {

    @PostConstruct
    public void check() {
        System.out.println("ENGLISH CONFIG");
    }
}
