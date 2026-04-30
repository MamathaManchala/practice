package com.programs.practice.arrays;

import java.util.HashSet;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 7, 3, 1, 2};

        removeDuplicates(numbers);
    }
    private static void removeDuplicates(int[] arr) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            if (uniqueSet.add(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
