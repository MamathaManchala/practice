package com.programs.practice.streams;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String args[]) {
        int number = 5;
        int factorial = IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Factorial: " + factorial);

        //approach 2
        int n = 5;
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);

//        //recurssion
//        public static long factorial(int n) {
//            if (n == 0 || n == 1) return 1;
//            return n * factorial(n - 1);
//        }
//        }

        long fact1 = java.util.stream.IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);
        System.out.println(fact1);
    }
}
