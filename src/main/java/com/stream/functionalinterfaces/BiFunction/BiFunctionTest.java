package com.stream.functionalinterfaces.BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;
/**
 * What is BiFunction?
 * package: java.util.function
 * It's a functional interface and can refer lambda expression which can take T and U as input parameters 
 * return any type R as output.
 * apply is the SAM,(andThen,compose are default methods) and identity is the static method.
 * @author hprakash
 *
 */
public class BiFunctionTest {

	public static void main(String[] args) {
		//pgm to create Student object using BiFunction.
		BiFunction<String,Integer,Student> studentCreationFunction=(name,rollNo)->new Student(name, rollNo);
		ArrayList<Student> students=new ArrayList<>();
		students.add(studentCreationFunction.apply("Hari", 49));
		students.add(studentCreationFunction.apply("Harish",52));
		students.add(studentCreationFunction.apply("Arjun",19));
		students.add(studentCreationFunction.apply("Chandran", 24));
		System.out.println(students);
	}

}
