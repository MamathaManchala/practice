package com.programs.practice.streams;

import java.util.Comparator;
import java.util.List;

public class SecondLargestElement {
    public static void main(String args[]){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int secondLargest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Second Largest: " + secondLargest);
    }
}
