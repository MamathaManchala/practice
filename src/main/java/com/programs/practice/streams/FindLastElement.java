package com.programs.practice.streams;

import java.util.LinkedList;
import java.util.List;

public class FindLastElement {
    public static void main(String args[]){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int last = numbers.stream().reduce((a, b) -> b).orElse(0);
        System.out.println("Last Element: " + last);

        int last1 = numbers.stream()
                .skip(numbers.size() - 1)
                .findFirst()
                .orElse(0);

        LinkedList<Integer> list = new LinkedList<>(numbers);
        int last2 = list.getLast();

        
        

    }
}
