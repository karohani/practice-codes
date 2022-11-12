package com.karohani.study.springcore.importselector;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class StaticFieldTest {

    private static String name;

    private StaticFieldTest(Property property) {
        this.name = property.getName();
    }

    public static String getName() {
        return name;
    }
    @ConfigurationProperties(prefix = "teemo")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Configuration
    public static class Property {
        private String name;
    }
}
