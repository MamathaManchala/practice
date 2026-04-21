package com.programs.practice.streams;

import java.util.List;

public class AnyElementCondition {
    public static void main(String args[]){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Any Even: " + anyEven);
    }
}
