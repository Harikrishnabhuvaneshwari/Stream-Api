package com.stream.functionalinterfaces.BiPredicate;

import java.util.function.BiPredicate;

/**
 * What is BiPredicate?(Same as predicate but takes two input values and always returns the boolean result.
 * package: java.util.function
 * It's a boolean valued function which checks the condition and always return boolean value as result.
 * test is the SAM, (or,and,negate are default methods), isEqual is the static method.
 * @author hprakash
 *
 */
public class BiPredicateTest {

	public static void main(String[] args) {
		//pgm to check even no using BiPredicate.
		BiPredicate<Integer,Integer> checkEvenNo=(a,b)->(a+b)%2==0;
		System.out.println(checkEvenNo.test(10, 20));
		System.out.println(checkEvenNo.test(1, 20));
	}

}
