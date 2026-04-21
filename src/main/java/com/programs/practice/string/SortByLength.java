package com.programs.practice.string;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {
    public static void main(String args[]){
        List<String> words = List.of("apple", "banana", "kiwi");
        List<String> sortedWords = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Sorted Words by Length: " + sortedWords);
    }
}
