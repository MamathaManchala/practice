package com.programs.practice.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 2, 5, 1};
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int num : inputArray) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.println("Duplicate: " + entry.getKey());
//            }
//        }
//

        int[] arr = {1,2,3,2,4,5,1,3};

        Map<Integer, Long> countMap =
                Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.groupingBy(
                                n -> n,
                                Collectors.counting()
                        ));

        countMap.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .forEach(e ->
                        System.out.println("Duplicate: " + e.getKey())
                );
    }
}
