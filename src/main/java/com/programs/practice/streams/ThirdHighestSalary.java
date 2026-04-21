package com.programs.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdHighestSalary {
    public static void main(String[] args) {
         List<Employee> employees = Arrays.asList(
                 new Employee(50000), new Employee(70000), new Employee(60000)
         );
         double thirdHighest = employees.stream()
         .map(Employee::getSalary)
         .distinct()
         .sorted(Comparator.reverseOrder())
         .skip(2)
         .findFirst()
         .orElse(0.0);
         System.out.println(thirdHighest); // 0.0 (if <3 salaries)
         }
}
