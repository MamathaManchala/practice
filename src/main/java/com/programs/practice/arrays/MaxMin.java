package com.programs.practice.arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

//    public static void findMinMax(int[] arr) {
//        int min = arr[0], max = arr[0];
//
//        for (int num : arr) {
//            if (num < min) min = num;
//            if (num > max) max = num;
//        }
//
//        System.out.println("Min: " + min + ", Max: " + max);
//    }
}
