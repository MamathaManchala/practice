package com.programs.practice.streams;

import java.util.List;

public class AllElementsCondition {
    public static void main(String args []){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("All Even: " + allEven);
    }
}
