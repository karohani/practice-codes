package com.karohani.study.springcore.annotationimport;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public EnglishConfig englishConfig() {
        return new EnglishConfig();
    }

    @Bean
    public KoreanConfig koreanConfig() {
        return new KoreanConfig();
    }

}
