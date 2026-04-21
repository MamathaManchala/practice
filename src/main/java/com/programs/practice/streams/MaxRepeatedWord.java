package com.programs.practice.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxRepeatedWord {
    public static String findMaxRepeated(String s) {
         Map<String, Long> map = Arrays.stream(s.split("\\s+"))
         .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
         return map.entrySet().stream()
         .max(Map.Entry.comparingByValue())
         .map(Map.Entry::getKey)
         .orElse("");
         }
 public static void main(String[] args) {
         System.out.println(findMaxRepeated("hello world hello")); // hello
         }
}
