package com.stream.functionalinterfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * What is Predicate?
 * package: java.util.function
 * It's a boolean valued function which checks the condition and always return boolean value as result.
 * test is the SAM, (or,and,negate are default methods), isEqual is the static method.
 * @author hprakash
 *
 */
public class PredicateTest {

	public class SoftwareEngineer{
		int age;
		boolean isGf;
		public SoftwareEngineer(int age,boolean isGf) {
			this.age=age;
			this.isGf=isGf;
		}
	}

	public static void main(String[] args) {
		PredicateTest predicateTest=new PredicateTest();
		Predicate<Integer> predicate=i->i>10;
		Predicate<Integer> predicate2=i->i<20;
		//Joining predicates.
		//we can join predicates using and,or(methods) conditions 
		System.out.println(predicate.and(predicate2).test(11));
		//we can even negate the result i.e., reverse the result using negate function
		System.out.println(predicate.and(predicate2).negate().test(12));


		List<Integer> integers=Arrays.asList(1,2,3,4,null,6,null,8,null,0);
		Predicate<Integer> predicateToRemoveNull=i->i!=null;
		System.out.println(integers.stream().filter(predicateToRemoveNull).collect(Collectors.toList()));

		Predicate<SoftwareEngineer> pubEntryCheck=softwareEngineer -> softwareEngineer.age>18 && softwareEngineer.isGf;
		SoftwareEngineer[] softwareEngineers={predicateTest.new SoftwareEngineer(18,true),
				predicateTest.new SoftwareEngineer(21,false)
				,predicateTest.new SoftwareEngineer(23,true)
				,predicateTest.new SoftwareEngineer(18,true)
				,predicateTest.new SoftwareEngineer(20,false)
				,predicateTest.new SoftwareEngineer(19,true)
				,predicateTest.new SoftwareEngineer(17,true)};
		for(SoftwareEngineer softwareEngineer:softwareEngineers){
			if(pubEntryCheck.test(softwareEngineer)){
				System.out.println("Allowed : Age: "+softwareEngineer.age+" GF: "+softwareEngineer.isGf);
			}else{
				System.out.println("Not Allowed : Age: "+softwareEngineer.age+" GF: "+softwareEngineer.isGf);
			}
		}
		Predicate<PredicateTest> isEqualPredicate = Predicate.isEqual(new PredicateTest());
		System.out.println(isEqualPredicate.test(new PredicateTest()));
	}

}
