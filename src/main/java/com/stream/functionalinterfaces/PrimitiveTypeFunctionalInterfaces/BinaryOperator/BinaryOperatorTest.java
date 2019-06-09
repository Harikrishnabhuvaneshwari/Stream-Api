package com.stream.functionalinterfaces.PrimitiveTypeFunctionalInterfaces.BinaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/**
 * Same as BiFunction interface but used when the two input params and return type are of
 * same type.
 * Primitive Versions are:
 * {@link IntBinaryOperator}
 * {@link LongBinaryOperator}
 * {@link DoubleBinaryOperator}
 * @author hprakash
 *
 */
public class BinaryOperatorTest {

	public static void main(String[] args) {
		//Here in this case the two i/p params and a return type are same(String).
		BinaryOperator<String> concat=(a,b)->a+" "+b;
		System.out.println(concat.apply("Play", "Ground"));
	}

}
