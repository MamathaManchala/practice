package com.programs.practice.arrays;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        //print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        //sum array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum:" + sum);

        //max number
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("max: "+ max);

        //min number
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("min: " + min);

        //reverse array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        //second largest element
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("Second: " + second);

        System.out.println("Sorting: " + Arrays.toString(arr));

        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, arr.length)));


        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
