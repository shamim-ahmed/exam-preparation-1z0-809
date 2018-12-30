package edu.buet.cse.ch05;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

public class InstantArithmetic {
  public static void main(String... args) {
    LocalDate date = LocalDate.of(2018, Month.DECEMBER, 30);
    LocalTime time = LocalTime.of(13, 25, 30);
    ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, ZoneId.of("Australia/Sydney"));

    Instant instant1 = zonedDateTime.toInstant();
    System.out.println(instant1);

    Instant instant2 = instant1.plusSeconds(30);
    System.out.println(instant2);

    Instant instant3 = instant1.plusMillis(1000);
    System.out.println(instant3);

    Instant instant4 = instant1.plusNanos(1000000099);
    System.out.println(instant4);

    Instant instant5 = instant1.plus(1, ChronoUnit.DAYS);
    System.out.println(instant5);

    Instant instant6 = instant1.plus(1, ChronoUnit.HOURS);
    System.out.println(instant6);

    try {
      // why will the following line throw an exception ?
      Instant instant7 = instant1.minus(1, ChronoUnit.MONTHS);
      System.out.println(instant7);
    } catch (UnsupportedTemporalTypeException ex) {
      System.err.println(ex);
    }
  }
}
