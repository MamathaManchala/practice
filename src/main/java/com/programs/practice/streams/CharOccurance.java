package com.programs.practice.streams;

import java.util.Map;
import java.util.stream.Collectors;

public class CharOccurance {
    public static Map<Character, Integer> countChars(String s) {
         return s.chars()
         .mapToObj(c -> (char) c)
         .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
         .entrySet().stream()
         .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().
                intValue()));
         }
  public static void main(String[] args) {

         System.out.println(countChars("hello")); // {h=1, e=1, l=2, o=1}
         }
}
