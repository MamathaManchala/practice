package com.programs.practice.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Even {
    public static void main(String args[]){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);
    }
}
