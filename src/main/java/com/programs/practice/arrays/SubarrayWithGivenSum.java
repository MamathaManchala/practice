package com.programs.practice.arrays;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;
        findSubarrayWithSum(numbers, targetSum);
    }
    private static void findSubarrayWithSum(int[] arr, int targetSum) {
        int start = 0, end = 0, currentSum = 0;
        while (end < arr.length) {
            currentSum += arr[end];
            while (currentSum > targetSum && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == targetSum) {
                System.out.println("Subarray found between indices " + start + " and " + end);
                return;
            }
            end++;
        }
        System.out.println("No subarray found with the given sum.");
    }

}
