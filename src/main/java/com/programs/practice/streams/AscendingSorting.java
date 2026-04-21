package com.programs.practice.streams;

import java.util.List;
import java.util.stream.Collectors;

public class AscendingSorting {
    public static void main(String args[]){
        List<Integer> numbers = List.of(5, 3, 1, 4, 2);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted().collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);
    }
}
