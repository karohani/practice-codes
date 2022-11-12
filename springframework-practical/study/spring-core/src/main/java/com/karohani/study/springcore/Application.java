package com.karohani.study.springcore;

import com.karohani.study.springcore.annotationimport.EnableCustom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCustom
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
