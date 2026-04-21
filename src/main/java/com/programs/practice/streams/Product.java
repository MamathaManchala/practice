package com.programs.practice.streams;

import java.util.Arrays;
import java.util.List;

public class Product {
    public static void main(String args[]){
        List<Integer> intList = Arrays.asList(4,2,3,6,3);

        //approach 1
        int intProduct = intList.stream().reduce(1,(a,b) -> a * b);
        System.out.println(intProduct);

        // approach 2
        int result = 1;
        for(int num: intList){
            result = num * result;
        }
        System.out.println("Result 2 "+ result);
    }
}
