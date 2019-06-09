package com.stream.functionalinterfaces.PrimitiveTypeFunctionalInterfaces.UnaryOperator;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

/**
 * Same as Function interface but should be used when both input and output types are 
 * same.
 * Primitive versions are:
 * {@link IntUnaryOperator}
 * {@link LongUnaryOperator}
 * {@link DoubleUnaryOperator}
 * @author hprakash
 *
 */
public class UnaryOperatorTest {

	public static void main(String[] args) {
		//Here in this case both input and return type are of same(String) type.
		UnaryOperator<String> concat=str->str+" concatenated";
		System.out.println(concat.apply("Altimetrik"));
	}

}
