package com.stream.functionalinterfaces.supplier;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

/**
 * What is Supplier?
 * package: java.util.function
 * It won't accept any input type arguments but will always return(supply) the required
 * value based on the type we mentioned.
 * get is the SAM, ( no default methods),  no static methods.
 * @author hprakash
 *
 */
public class SupplierTest {
	public static void main(String[] args) {
		//Pgm to get System Date by using Supplier.
		Supplier<Date> supplySystemDate=()->new Date();
		System.out.println(supplySystemDate.get());

		//pgm to get a random name using Supplier.
		String[] names={"hari","krishna","gopi","rama","gautama","siddhartha"};
		Supplier<String> supplyRandomName=()->{
			//			Random random=new Random();
			//			return names[random.nextInt(names.length)];
			//			(or)
			int random=(int)(Math.random()*6);
			return names[random];
		};
		System.out.println("Generated Random Name : "+supplyRandomName.get());
		System.out.println("Generated Random Name : "+supplyRandomName.get());
		System.out.println("Generated Random Name : "+supplyRandomName.get());
		System.out.println("Generated Random Name : "+supplyRandomName.get());

		//pgm to generate OTP using Supplier.
		Supplier<String> supplyOTP=()->{
			StringBuilder otp=new StringBuilder();
			for(int i=0;i<6;i++){
				otp.append((int)(Math.random()*10));
			}
			return otp.toString();
		};
		System.out.println();
		System.out.println("Random OTP "+supplyOTP.get());
		System.out.println("Random OTP "+supplyOTP.get());
		System.out.println("Random OTP "+supplyOTP.get());
		System.out.println("Random OTP "+supplyOTP.get());
		System.out.println("Random OTP "+supplyOTP.get());

		//pgm to generate random password using Supplier.
		Supplier<String> supplyPassword=()->{
			Supplier<Integer> supplyRandomDigit=()->(int)(Math.random()*10);
			String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> supplyRandomCharacter=()->symbols.charAt((int)(Math.random()*29));
			StringBuilder password=new StringBuilder();
			for(int i=1;i<9;i++){
				 if(i%2==0)
					 password.append(supplyRandomCharacter.get());
				 else
					 password.append(supplyRandomDigit.get());
			}
			return password.toString();
		};
		System.out.println();
		System.out.println("Random Password "+supplyPassword.get());
		System.out.println("Random Password "+supplyPassword.get());
		System.out.println("Random Password "+supplyPassword.get());
		System.out.println("Random Password "+supplyPassword.get());
		System.out.println("Random Password "+supplyPassword.get());
	}
}
