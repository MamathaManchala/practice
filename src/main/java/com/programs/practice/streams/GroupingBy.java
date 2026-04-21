package com.programs.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Adam");
        Map<Character, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(grouped); // {A=[Alice, Adam], B=[Bob]}
    }
}
