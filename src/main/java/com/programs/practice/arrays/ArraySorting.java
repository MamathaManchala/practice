package com.programs.practice.arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) break;
        }
    }

//    public static boolean isSorted(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < arr[i - 1]) {
//                return false;
//            }
//        }
//        return true;
//    }
}
