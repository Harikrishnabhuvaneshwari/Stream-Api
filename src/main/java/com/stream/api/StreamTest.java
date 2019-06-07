package com.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {

		Student student1 = new Student(	"Jayesh",20,new Address("1234"),Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
		Student student2 = new Student("Khyati",20,new Address("1235"),Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));
		Student student3 = new Student("Jason",20,new Address("1236"),Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));
		List<Student> students=Arrays.asList(student1,student2,student3);

		//Get student with exact match name "jayesh"
		Optional<Student> optional=students.stream().filter(student->student.getName().equals("Jayesh")).findFirst();
		System.out.println(optional.isPresent()?optional.get():"Not found");

		//Get student with matching address "1235"
		Optional<Student> optional2=students.stream().filter(student->student.getAddress().equals(new Address("1235"))).findFirst();
		System.out.println(optional2.isPresent()?optional2.get():Optional.empty());

		//Get all student having mobile numbers 3333.
		List<Student> sameMobileNos = students.stream().filter(student->student.getMobileNumbers().contains(new MobileNumber("3333"))).collect(Collectors.toList());
		System.out.println(sameMobileNos);

		//Get all student having mobile number 1233 and 1234
		List<Student> studentMobileNos = students.stream().filter(student->student.getMobileNumbers().contains(new MobileNumber("1233"))&&student.getMobileNumbers().contains(new MobileNumber("1234"))).collect(Collectors.toList());
		System.out.println(studentMobileNos);

		/*****************************************************
        Create a List<Student> from the List<TempStudent>
		 *****************************************************/
		TempStudent tmpStud1 = new TempStudent("Jayesh1",201,new Address("12341"),Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));
		TempStudent tmpStud2 = new TempStudent("Khyati1",202,new Address("12351"),Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));
		List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);
		List<Student> studentsFromTempStudents = tmpStudents.stream().map(tempStudent->new Student(tempStudent.getName(),tempStudent.getAge(),tempStudent.getAddress(),tempStudent.getMobileNumbers())).collect(Collectors.toList());
		System.out.println(studentsFromTempStudents);

		//Convert List<Student> to List<String> of student name
		List<String> names = students.stream().map(Student::getName).collect(Collectors.toList());
		System.out.println(names.stream().collect(Collectors.joining(",,,,,,")));


		List<String> nameList=Arrays.asList("apple","avacado","alovera","banana","beetroot","cashew","dragonfruit","doughnut");
		
		
		

		List<Integer> doneIndex=new ArrayList<>();
		List<List<String>> groupedList=new ArrayList<>();
		for (int i = 0;!doneIndex.contains(i)&&i<nameList.size();) {
			List<String> temp=new ArrayList<>();
			temp.add(nameList.get(i));
			for(int j=i+1;j<nameList.size();j++){
				if(nameList.get(i).charAt(0)==nameList.get(j).charAt(0)){
					temp.add(nameList.get(j));
					doneIndex.add(j);
				}
			}
			while(doneIndex.contains(++i)){

			}
			groupedList.add(temp);
		}

		System.out.println(groupedList);
		
	}
}
