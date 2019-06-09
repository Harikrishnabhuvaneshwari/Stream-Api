package com.stream.functionalinterfaces.PrimitiveTypeFunctionalInterfaces.PrimitivePredicateTypes;

import java.util.function.*;

/**
 * To overcome performance issues caused by autoboxing and autounboxing of primitive types
 * in normal functional interfaces(Predicate,Function etc.,) which always takes Objects as
 * type parameters Primitive Type Functional Interfaces are introduced one such is IntPredicate
 * @author hprakash
 *
 */
public class IntPredicateTest {
	
	// same for LongPredicate and DoublePredicate
	
	public static void main(String[] args) {
		int[] numbers={1,2,3,4,5,6};
		// here the input type is Object Type. which causes performance issues by autoboxing & autounboxing.
		Predicate<Integer> predicate=i->i%2==0;  //not the best option.
		IntPredicate intPredicate=i->i%2==0;   //best option, which by default takes int as type parameter.
		for (int j : numbers) {
			if(intPredicate.test(j)){
				System.out.println("I'm even "+j);
			}
		}
	}

}
