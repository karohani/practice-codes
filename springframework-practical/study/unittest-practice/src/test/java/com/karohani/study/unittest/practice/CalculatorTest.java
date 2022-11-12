package com.karohani.study.unittest.practice;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// 1. 내가 테스트 하고자하는 클래스명 + Test라는 클래스를 만든다.
class CalculatorTest {
    // Context
        // Given
    Calculator calculator = new Calculator();

    // 2. 내가 테스트하고자 하는 클래스의 메서드명과 같은 내부 클래스를 만들고 @Nested를 붙인다.
    @Nested
    @DisplayName("method : add")
    public class add {

        // 3. 메서드에 각각 어떤 input이 들어오고 어떤 동작이 되어야 하는지 명시하고 테스트를 작성한다.
        @DisplayName("add(1, 2)일 때 3을 반환한다.")
        @Test
        public void test01() {
            assertEquals(calculator.add(1,2), 3);
        }
        @DisplayName("add(2, 2)일 때 4을 반환한다.")
        @Test
        public void test02() {
            assertEquals(calculator.add(2,2), 4);
        }
        @DisplayName("add(0, 0)일 때 0을 반환한다.")
        @Test
        public void test03() {
            assertEquals(calculator.add(0,0), 0);
        }
    }

    @Test
    public void aa() {
        Method method = Calculator.class.getMethod( "" );
        Parameter[] parameters = method.getParameters();
        Arrays.stream( parameters ).map( r-> r.getAnnotation(  ))
    }
}