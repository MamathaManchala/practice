package com.programs.practice.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4};
        int newLength = removeDuplicates(arr);
        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int uniqueIndex = 1; // Start from the second element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // Check if current element is different from the previous one
                arr[uniqueIndex] = arr[i]; // Move unique element to the uniqueIndex
                uniqueIndex++; // Increment uniqueIndex for the next unique element
            }
        }

        return uniqueIndex; // Return the length of the array with unique elements
    }


//    public static int[] removeDuplicates(int[] arr) {
//        Set<Integer> set = new LinkedHashSet<>();
//        for (int num : arr) {
//            set.add(num);
//        }
//
//        return set.stream().mapToInt(i -> i).toArray();
//    }
}
