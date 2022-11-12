package com.study.effective.java;

import java.util.Collection;
import java.util.function.UnaryOperator;

public class Item30 {
    private String a;
    private static UnaryOperator<Object> IDENTIFY = t -> t;

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTIFY;
    }

    interface Speakable<T extends Speakable<T>> {
       default void speak() {
           System.out.println("Speak");
        }
    }

}

