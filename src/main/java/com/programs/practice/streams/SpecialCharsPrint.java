package com.programs.practice.streams;

public class SpecialCharsPrint {
    public static void printSpecial(String s) {
         s.chars()
         .mapToObj(c -> (char) c)
         .filter(c -> !Character.isLetterOrDigit(c))
         .forEach(System.out::println);
         }
 public static void main(String[] args) {
         printSpecial("Hello!@#"); // !, @, #
         }
}
