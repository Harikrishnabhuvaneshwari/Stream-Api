package com.stream.functionalinterfaces.MethodAndStaticReferences;

/**
 * Can be used as a substitute for lambda expression in case the method with same arg type
 * is found irrespective of return type and access specifier(i.e., arg type should be same 
 * and return type maybe different.)
 * Improves the code reusability.
 * @author hprakash
 *
 */
public class MethodReference {
	
	public void display(){
		System.out.println("Instance method reference");
	}
	
	public static void main(String[] args) {
		MethodReference methodReference=new MethodReference();
		Test test=methodReference::display;  // here the lambda exp is replaced by method ref
		test.print();
	}

}
