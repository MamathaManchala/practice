package com.programs.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencySort {
    public static void main(String[] args) {
        int[] arr = {2,2,4,3,7,3,3,7,4,7,7,9};

        Map<Integer, Long> freqMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        List<Integer> result = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> {
                    int freqCompare = freqMap.get(a).compareTo(freqMap.get(b));
                    if (freqCompare != 0) {
                        return freqCompare; // sort by frequency
                    }
                    return a - b; // sort by value if same freq
                })
                .collect(Collectors.toList());

        System.out.println(result);
    }

}