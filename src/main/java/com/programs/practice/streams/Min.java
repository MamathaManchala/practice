package com.programs.practice.streams;

import java.util.List;

public class Min {
    public static void main(String args[]){
        List<Integer> numbers = List.of(1,1, 2, 3, 4, 5);
        int min = numbers.stream().min(Integer::compare).orElse(0);
        System.out.println("Min: " + min);

        int min1 = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        int min2 = numbers.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);

        int min3 = numbers.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);

        int min4 = numbers.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);

        int min5 = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min5) {
                min5 = num;
            }
        }

        int min6 = numbers.stream()
                .sorted()
                .findFirst()
                .orElse(0);





    }
}
