package com.study.effective.java;

import lombok.Getter;

@Configuration
@ConfigurationProperties("external")
@Getter
public class Property {
    private String path;
}
