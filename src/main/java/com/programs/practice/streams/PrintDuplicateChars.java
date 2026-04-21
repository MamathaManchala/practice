package com.programs.practice.streams;

import java.util.Map;
import java.util.stream.Collectors;

public class PrintDuplicateChars {
    public static void printDuplicates(String s) {
        Map<Character, Long> map = s.chars()
         .mapToObj(c -> (char) c)
         .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
         map.entrySet().stream()
         .filter(e -> e.getValue() > 1)
         .forEach(e -> System.out.println(e.getKey()));
         }
 public static void main(String[] args) {
         printDuplicates("hello"); // l
         }
}
