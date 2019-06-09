package com.stream.functionalinterfaces.function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

import com.stream.functionalinterfaces.Common.Employee;

/**
 * What is Function?
 * package: java.util.function
 * It's a functional interface and can refer lambda expression which can take T as input parameter 
 * return any type R as output.
 * apply is the SAM,(andThen,compose are default methods) and identity is the static method.
 * @author hprakash
 *
 */
public class FunctionTest {

	public static void main(String[] args) {
		//Find the length of the string.
		Function<String,Integer> function=s->s.length();
		System.out.println("Length : "+function.apply("altimetrik"));

		//Find square of a number n.
		Function<Integer,Double> function2=n->n.doubleValue()*n.doubleValue();
		System.out.println("Square : "+function2.apply(5));
		System.out.println(function2.andThen(i->i/2).apply(200));

		//Function to remove spaces present in the string.
		Function<String, String> removeSpaceFunction=s->s.replace(" ", "");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String with spaces present :");
		String s=scanner.nextLine();
		System.out.println("String after removing the spaces : "+removeSpaceFunction.apply(s));

		//Function to count spaces present in the given string
		Function<String,Integer> functionToCountSpaces=str->str.length()-str.replace(" ", "").length();
		System.out.println("No of spaces present in the entered string : "+functionToCountSpaces.apply(s));

		//Function to increment salary for employees using Predicate.
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("ani", 2500));
		employees.add(new Employee("bni", 3500));
		employees.add(new Employee("cni", 500));
		employees.add(new Employee("dni", 4000));
		employees.add(new Employee("eni", 3000));
		Predicate<Employee> testSalary=employee->employee.getSalary()<3000;
		Function<Employee,Employee> incrementSalary=employee->{
			if(testSalary.test(employee))
				employee.setSalary(employee.getSalary()+477);
			return employee;
		};
		for(Employee employee:employees){
			incrementSalary.apply(employee);
			System.out.println(employee);
			System.out.println();
		}

		//Function Chaining
		//Pgm for user authentication.
		System.out.println("Enter username :");
		String user=scanner.next();
		System.out.println("Entert password :");
		String pwd=scanner.next();
		Function<String,String> functionToGetSubString=userName->userName.substring(0, 4);
		Function<String,String> functionToConvertToLowerCase=userName->userName.toLowerCase();
		Predicate<String> predicateToCheckUserName=userName->userName.equals("hari");
		Predicate<String> predicateToCheckPwd=pwsd->pwsd.equals("java");
		if(predicateToCheckUserName.test(functionToGetSubString.andThen(functionToConvertToLowerCase).apply(user))
				&&predicateToCheckPwd.test(pwd)){
			System.out.println("Authenticated User");
		}
		scanner.close();

		//Function's static method identity(will always return input as its output i.e., its return is
		//input itself).
		Function<String, String> identityFunction = Function.identity();
		System.out.println(identityFunction.apply("doctor"));
	}
}
