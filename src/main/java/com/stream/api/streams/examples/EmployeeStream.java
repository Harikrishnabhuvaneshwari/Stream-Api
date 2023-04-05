package com.stream.api.streams.examples;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStream {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.loadEmployeeData();

        System.out.println("--------> 1. How many male and female employees are there in the organization?");
        // naive approach:
        long maleCount = employeeList.stream().filter(employee -> "Male".equals(employee.getGender())).count();
        long femaleCount = employeeList.stream().filter(employee -> "Female".equals(employee.getGender())).count();
        System.out.println("Male Employee Count : " + maleCount);
        System.out.println("Female Employee Count : " + femaleCount);
        // better approach:
        Map<String, Long> employeeCountMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(employeeCountMap);


        System.out.println("-------> 2. Print the name of all departments in the organization?");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        System.out.println("--------> 3. What is the average age of male and female employees?");
        Map<String, Double> averageAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(averageAge);

        System.out.println("----------> 4. Get the details of highest paid employee in the organization?");
        Optional<Employee> max = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(max.orElse(null));

        System.out.println("-----------> 5. Get the names of all employees who have joined after 2015?");
        List<String> names = employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015).map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);

        System.out.println("----------> 6. Count the number of employees in each department?");
        Map<String, Long> groupByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(groupByDepartment);

        System.out.println("---------> 7. What is the average salary of each department?");
        Map<String, Double> averageSalaray = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalaray);

        System.out.println("---------> 8. Get the details of youngest male employee in the product development department?");
        Optional<Employee> youngestMaleEmployee = employeeList.stream()
                .filter(employee -> "Male".equals(employee.getGender()) && "Product Development".equals(employee.getDepartment()))
                .min(Comparator.comparing(Employee::getAge));
        System.out.println(youngestMaleEmployee.orElse(null));

        System.out.println("---------> 9. Who has the most working experience in the organization?");
        Optional<Employee> mostExpriencedInOrg = employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining));
        System.out.println(mostExpriencedInOrg.orElse(null));


        System.out.println("----------> 10. How many male and female employees are there in the sales and marketing team?");
        Map<String, Long> salesAndMarketingTeamCount = employeeList.stream().filter(employee -> "Sales And Marketing".equals(employee.getDepartment()))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(salesAndMarketingTeamCount);


        System.out.println("----------> 11. What is the average salary of male and female employees?");
        Map<String, Double> averageSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalary);

        System.out.println("---------> 12. List down the names of all employees in each department?");
        Map<String, List<String>> employeeNames = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(employeeNames);

        System.out.println("----------> 13. What is the average salary and total salary of the whole organization?");
        DoubleSummaryStatistics salarySummaryStats = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary : "+salarySummaryStats.getAverage());
        System.out.println("Total Salary : "+salarySummaryStats.getSum());

        System.out.println("-----------> 14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
        Map<Boolean, List<Employee>> ageWiseMap = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() > 25));
        ageWiseMap.entrySet().forEach(System.out::println);

        System.out.println("----------> 15. Who is the oldest employee in the organization? What is his age and which department he belongs to?");
        Optional<Employee> oldestEmployee = employeeList.stream().max(Comparator.comparing(Employee::getAge));
        System.out.println(oldestEmployee.orElse(null));

    }
}
