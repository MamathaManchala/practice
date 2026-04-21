package com.programs.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Average {
    public static void main(String args[]) {
        List<Integer> intList = Arrays.asList(4, 2, 3, 6, 3);
        double avg = intList.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(avg);

        double average = intList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0);
        System.out.println(average);

        double avg1 = intList.stream().reduce(0, Integer::sum)/(double) intList.size();
        System.out.println(avg1);

        double avg2 = intList.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(avg2);

    }
}
