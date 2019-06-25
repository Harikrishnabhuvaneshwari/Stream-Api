package com.stream.date.time.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Date,Calendar,TimeStamp --> Not Convenient,not upto best performance wise,most methods deprecated
 * joda time api ---> introduced in java 8 to overcome above.
 * @author hprakash
 *
 */
public class DateTimeApiTest {

	public static void main(String[] args) {
		//joda date time api
		//java.time package
		LocalDate localDate=LocalDate.now();   //LocalDate
		System.out.println(localDate);
		LocalTime localTime=LocalTime.now();   //LocalTime	
		System.out.println(localTime);
		System.out.println();
		System.out.println("Customized date and time");
		int dd=localDate.getDayOfMonth();
		int mm=localDate.getMonthValue();
		int yyyy=localDate.getYear();
		System.out.printf("Customized date format %d-%d-%d", dd,mm,yyyy);
		System.out.println();

		int hh=localTime.getHour();
		int MM=localTime.getMinute();
		int ss=localTime.getSecond();
		int nn=localTime.getNano();
		System.out.printf("Customized time format %d:%d:%d:%d",hh,MM,ss,nn);
		System.out.println();
		System.out.println();
		
		System.out.println("LocalDateTime");
		//We can use single LocalDateTime object for above purpose.
		LocalDateTime localDateTime=LocalDateTime.now();	//LocalDateTime
		System.out.println(localDateTime);
		//Customized factory methods (of methods) available
		System.out.println(LocalDateTime.of(1995, Month.SEPTEMBER,20,16,30));
		System.out.println();
		//We can add and subtract years,months,days,hours,minutes,seconds,nanos
		System.out.println("Adding and Subtracting Months");
		System.out.println(localDateTime.plusMonths(6));
		System.out.println(localDateTime.minusMonths(6));

		LocalDate now = LocalDate.now();
		System.out.println(now.format(DateTimeFormatter.ISO_DATE));

	}

}
