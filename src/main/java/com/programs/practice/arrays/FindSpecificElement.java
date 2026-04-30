package com.programs.practice.arrays;

public class FindSpecificElement {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 12, 15};
        int target = 9;
        boolean contains = false;
        for (int num : numbers) {
            if (num == target) {
                contains = true;
                break;
            }
        }
        if (contains) {
            System.out.println("Array contains " + target);
        } else {
            System.out.println("Array does not contain " + target);
        }
    }
}
