package com.programs.practice.streams;

import java.util.List;

public class FindFirstElement {
    public static void main(String args[]){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int first = numbers.stream().findFirst().orElse(0);
        System.out.println("First Element: " + first);
    }
}
