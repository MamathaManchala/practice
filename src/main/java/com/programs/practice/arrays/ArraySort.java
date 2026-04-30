package com.programs.practice.arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        if (isSorted(numbers)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
