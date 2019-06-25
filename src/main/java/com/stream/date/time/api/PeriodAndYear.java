package com.stream.date.time.api;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

/**
 * @author hprakash
 *
 */
public class PeriodAndYear {

	public static void main(String[] args) {
		//Period example
		LocalDate bd=LocalDate.of(1995, 9, 20);
		LocalDate cd=LocalDate.now();
		Period period=Period.between(bd, cd);
		System.out.printf("I'm %d years %d months %d days old",period.getYears(),period.getMonths(),period.getDays());
		System.out.println();
		System.out.println("I'm "+(period.getYears()*365+period.getMonths()*30+period.getDays())+" days old");
		
		//Year simple example
		System.out.println(Year.isLeap(Year.of(2016).getValue()));
	}

}
