package com.programs.practice.streams;

import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

public class Max {
    public static void main(String args[]) {
        List<Integer> numbers = List.of(1, 6, 3, 4, 5);
        int max = numbers.stream().max(Integer::compare).orElse(0);
        System.out.println(max);

        OptionalInt maxNum = numbers.stream().mapToInt(Integer::intValue).max();
        System.out.println(maxNum);

        int maxNum1 = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(maxNum1);

        int max1 = numbers.stream().reduce(Integer.MIN_VALUE , (a ,b)-> a>b?a:b);
        System.out.println(max1);

        int max2 = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(max2);

        int max3 = Collections.max(numbers);
        System.out.println(max3);

        int max4 = numbers.stream()
                .sorted((a, b) -> b - a)
                .findFirst()
                .orElse(0);
        System.out.println(max4);

        int max5 = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max5) {
                max5 = num;
            }
        }
        System.out.println(max5);

    }
}
