package com.programs.practice.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String args[]){
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        int sum = intList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
