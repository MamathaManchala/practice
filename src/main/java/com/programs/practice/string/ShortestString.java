package com.programs.practice.string;

import java.util.Comparator;
import java.util.List;

public class ShortestString {
    public static void main(String args[]){
        List<String> words = List.of("apple", "banana", "kiwi");
        String shortest = words.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Shortest Word: " + shortest);
    }
}
