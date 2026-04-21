package com.programs.practice.string;

import java.util.Comparator;
import java.util.List;

public class LongestString {
    public static void main(String args[]){
        List<String> words = List.of("apple", "banana", "kiwi");
        String longest = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Longest Word: " + longest);
    }
}
