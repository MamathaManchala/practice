package com.programs.practice.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second Largest: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // Update second largest before updating largest
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num; // Update second largest if it's greater than current second largest and not equal to largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }

        return secondLargest;
    }


//    public static int secondLargest(int[] arr) {
//        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
//
//        for (int num : arr) {
//            if (num > first) {
//                second = first;
//                first = num;
//            } else if (num > second && num != first) {
//                second = num;
//            }
//        }
//        return second;
//    }
}
