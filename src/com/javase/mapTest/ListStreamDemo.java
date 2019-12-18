package com.javase.mapTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreamDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("1", "SMITH", 800, 20);
        Employee e2 = new Employee("2", "ALLEN", 1600, 30);
        Employee e3 = new Employee("3", "WARD", 1250, 30);
        Employee e4 = new Employee("5", "CLARK", 2450, 10);
        Employee e5 = new Employee("4", "ADAMS", 1100, 20);

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);

        List<Employee> sortedEmp = employees.stream().sorted(Comparator.comparing(Employee::getEmpno)).collect(Collectors.toList());
        sortedEmp.stream().forEach(System.out::println);
    }
}
