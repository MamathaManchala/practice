package com.programs.practice.string;

import java.util.List;
import java.util.stream.Collectors;

public class AlphabeticalSorting {
    public static void main(String args[]){
        List<String> words = List.of("banana", "apple", "cherry");
        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Words: " + sortedWords);
    }
}
