package com.java.lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.Duration;;

public class DateDiff {
	public static void main(String[] args) {
		/**
		 * If you want logical calendar days, use DAYS.between() method from java.time.temporal.ChronoUnit:
		 */
		LocalDate dateBefore = LocalDate.now().plusDays(1);
		LocalDate dateAfter = LocalDate.now().plusDays(3);
		long daysBetween = DAYS.between(dateBefore, dateAfter);
		System.out.println(daysBetween);
		long x = Duration.between(dateBefore.atStartOfDay(), dateAfter.atStartOfDay()).toDays(); // another option
		System.out.println(x);
		// could build date this way
		LocalDate independenceDay = LocalDate.of(2014, Month.JULY, 4);
		// date to LocalDate
		Date input = new Date();
		LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		// alternatively
		Calendar cal = Calendar.getInstance();
		cal.setTime(input);
		LocalDate datex = LocalDate.of(cal.get(Calendar.YEAR),
		        cal.get(Calendar.MONTH) + 1,
		        cal.get(Calendar.DAY_OF_MONTH));
		// localdate to date
		Date datey = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
		// dAte to localdatetime and vice-versa
		Date in = new Date();
		LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
		Date out = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
	}

}
