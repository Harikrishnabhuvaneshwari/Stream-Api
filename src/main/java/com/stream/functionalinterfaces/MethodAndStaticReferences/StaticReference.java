package com.stream.functionalinterfaces.MethodAndStaticReferences;
/**
 * see {@link MethodReference}
 * @author hprakash
 *
 */
public class StaticReference {

	public static void display(){
		System.out.println("Static method reference");
	}

	public static void main(String[] args) {
		Test test=StaticReference::display;  // here the lambda exp is replaced by method ref
		test.print();
	}
}
