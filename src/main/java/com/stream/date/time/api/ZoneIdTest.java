package com.stream.date.time.api;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalUnit;

/**
 * 
 * @author hprakash
 *
 */
public class ZoneIdTest {

	public static void main(String[] args) {
		ZoneId zoneId=ZoneId.systemDefault();
		System.out.println(zoneId);

		ZonedDateTime dt=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(dt);
	}

}
