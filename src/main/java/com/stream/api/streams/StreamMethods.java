package com.stream.api.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>(Arrays.asList(0,5,10,15,20,25));
		//		Without Streams before 1.8 ver
		List<Integer> filteredList=new ArrayList<>();
		for (Integer integer : numbers) {
			if(integer%2==0){
				filteredList.add(integer);
			}
		}
		System.out.println("Without Streams Operation : "+filteredList);

		//		With Streams from 1.8 ver -----> filter
		List<Integer> result=numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("With Streams : "+result);

		//		Without Streams before 1.8 ver
		List<Integer> filteredList1=new ArrayList<>();
		for (Integer integer : numbers) {
			filteredList1.add(integer*2);
		}
		System.out.println("Without Streams Operation : "+filteredList1);

		//		With Streams from 1.8 ver -----> map
		List<Integer> result1=numbers.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("With Streams : "+result1);

		//Default sorting order(natural sorting) in stream.
		System.out.println("Natural Sorting : "+numbers.stream().sorted().collect(Collectors.toList()));

		// Customized Sorted Method in stream.
		System.out.println("Customized Sorting : "+numbers.stream().sorted((i,j)->j-i).collect(Collectors.toList()));

		//min and max methods in stream.
		System.out.println("Max value : "+numbers.stream().max((i,j)->i.compareTo(j)).get());
		System.out.println("Min Value : "+numbers.stream().min((i,j)->i.compareTo(j)).get());
		System.out.println("Max value : "+numbers.stream().max((i,j)->-i.compareTo(j)).get());
		System.out.println("Min Value : "+numbers.stream().min((i,j)->-i.compareTo(j)).get());

		//toArray method.
		Integer[] val = numbers.stream().toArray(Integer[]::new);
		for (Object object : val) {
			System.out.print(object+",");
		}

		System.out.println();

		//Stream's of method for group of objects.
		Stream.of(val).forEach(System.out::println);
		Stream.of(1,2,3,4,5,6).map(Math::sqrt).forEach(System.out::println);
	}

}
