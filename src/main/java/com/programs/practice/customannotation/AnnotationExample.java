package com.programs.practice.customannotation;

import org.springframework.stereotype.Component;

@Component
public class AnnotationExample {
    @LogExecutionTime
    public int add(int a, int b) {
        return (a + b);
    }
}
