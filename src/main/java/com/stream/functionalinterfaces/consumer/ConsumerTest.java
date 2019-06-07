package com.stream.functionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * What is Consumer?
 * package: java.util.function
 * It consumes input and perform some operation on it and it won't return anything.
 * accept is the SAM, andThen is the only default method.
 * @author hprakash
 *
 */
public class ConsumerTest {
	public static void main(String[] args) {

		//Pgm to display movie information using consumer
		List<Movie> movies=new ArrayList<>();
		movies.add(new Movie("2.0", "Rajini", "Emy"));
		movies.add(new Movie("Viswaroop", "Kamal", "Andrea"));
		movies.add(new Movie("Kathi", "Vijay", "Samantha"));
		movies.add(new Movie("Billa", "Ajith", "Nayan"));
		movies.add(new Movie("VtV", "Simbu", "Trisha"));
		Consumer<Movie> consume=movie->{
			System.out.println("Movie Name : "+movie.getName());
			System.out.println("Movie Actor : "+movie.getActor());
			System.out.println("Movie Actress : "+movie.getActress());
			System.out.println();
		};
		for (Movie movie2 : movies) {
			consume.accept(movie2);
		}
	}
}
