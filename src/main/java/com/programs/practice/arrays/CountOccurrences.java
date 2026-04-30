package com.programs.practice.arrays;

import java.util.HashMap;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 7, 3, 1, 2};
        countOccurrences(numbers);
    }
    private static void countOccurrences(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (int num : frequencyMap.keySet()) {
            System.out.println("Element: " + num + ", Frequency: " + frequencyMap.get(num));
        }
    }
}
