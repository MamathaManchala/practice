package com.programs.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Count {
    public static void main(String args[]){
    List<Integer> list = new ArrayList<>();
    List<Integer> numList = Arrays.asList(9,7,5,3,1,2,4,6,8);
    List<String> strList = Arrays.asList("Mam","Raj","Jyo","Kav","pri");

    long intCount = numList.stream().count();
    System.out.println("Count of num " + intCount);

    long strCount = strList.stream().count();
    System.out.println("Count of str " + strCount);

    long occCount = strList.stream().filter(w-> w.startsWith("R")).count();
    System.out.println(occCount);

    int count = numList.size();
    System.out.println(count);

    long count1 = numList.stream()
                .mapToInt(Integer::intValue)
                .count();
        System.out.println(count1);

    int count2 = numList.stream()
                .reduce(0, (a, b) -> a + 1, Integer::sum);
        System.out.println(count2);

    int count3 = 0;
    for (Integer num : numList) {
       count3++;
    }
        System.out.println(count3);
    }
}
