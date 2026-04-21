package com.programs.practice.streams;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main( String args[]){
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);

        List<Integer> uniqueElements = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueElements);

        List<Integer> unique = numbers.stream()
                .distinct()
                .toList();

        List<Integer> unique1 = new ArrayList<>(new HashSet<>(numbers));

        List<Integer> unique2 = new ArrayList<>(new LinkedHashSet<>(numbers));

        List<Integer> unique3 = new ArrayList<>(new TreeSet<>(numbers));

        Set<Integer> uniqueSet = numbers.stream().collect(Collectors.toSet());

    }
}
