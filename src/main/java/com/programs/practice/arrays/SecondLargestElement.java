package com.programs.practice.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 1, 9, 3};

        int secondLargest = findSecondLargest(numbers);
        System.out.println("Second Largest Element: " + secondLargest);
    }
    private static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
