package com.tobyspring.chapter6.reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaReflectionTest {

    @Test
    public void a() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String name = "흐미 이게 맞나";
        Method length = name.getClass().getMethod("length");
        System.out.println(length);
        // length()
        assertThat(length.invoke(name)).isEqualTo(8);
    }
}
