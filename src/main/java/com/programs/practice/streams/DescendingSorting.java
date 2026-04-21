package com.programs.practice.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingSorting {
    public static void main(String args[]){
        List<Integer> numbers = List.of(5, 3, 1, 4, 2);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted Numbers (Descending): " + sortedNumbers);
    }
}
