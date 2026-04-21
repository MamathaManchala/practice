package com.programs.practice.streams;

import java.util.List;

public class FindElement {
    public static void main(String args[]){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        boolean contains = numbers.stream().anyMatch(n -> n == 3);
        System.out.println(contains);
    }
}
