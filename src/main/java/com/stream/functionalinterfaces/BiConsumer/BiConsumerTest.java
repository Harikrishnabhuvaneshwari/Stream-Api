package com.stream.functionalinterfaces.BiConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import com.stream.functionalinterfaces.Common.Employee;

/**
 * What is BiConsumer?
 * package: java.util.function
 * It consumes two input parameters and perform some operation on it and it won't return anything.
 * accept is the SAM, andThen is the only default method.
 * @author hprakash
 *
 */
public class BiConsumerTest {

	public static void main(String[] args) {
		//Pgm to increment salary of the employees using BiFunction and BiConsumer.
		BiFunction<String,Integer,Employee> employeeFactory=(name,salary)->new Employee(name,salary);
		BiConsumer<Employee,Integer> salaryCalculator=(employee,increment)->{employee.setSalary(employee.getSalary()+increment);};
		List<Employee> employees=new ArrayList<>();
		employees.add(employeeFactory.apply("Hari",100));
		employees.add(employeeFactory.apply("Rama",200));
		employees.add(employeeFactory.apply("Amar",300));
		employees.add(employeeFactory.apply("Kiran",200));
		employees.add(employeeFactory.apply("Harish",100));
		for(Employee employee:employees){
			salaryCalculator.accept(employee,300);
			System.out.println("Employee Name : "+employee.getName());
			System.out.println("Employee Salary : "+employee.getSalary());
			System.out.println();
		}
	}

}
