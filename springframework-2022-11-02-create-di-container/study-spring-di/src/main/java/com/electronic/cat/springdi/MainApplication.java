package com.electronic.cat.springdi;

import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    생성자 주입 (*)
    Setter 주입 <-
    필드 주입  <-
    일반 메서드 주입 <-
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
