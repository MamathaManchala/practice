package com.programs.practice.streams;

import java.util.List;

public class SecondSmallestElemtn {
    public static void main(String args[]){
        List<Integer> numbers = List.of(1, 4, 3, 6, 5);
        int secondSmallest = numbers.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}
