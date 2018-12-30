package edu.buet.cse.ch05;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.UnsupportedTemporalTypeException;

public class LocalDateArithmetic2 {
  public static void main(String... args) {
    LocalDate date = LocalDate.of(2018, 12, 30);
    LocalTime time = LocalTime.of(11, 25);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("Australia/Sydney"));
    Period period = Period.ofDays(1);
    Duration duration = Duration.ofHours(24);

    // LocalDate example
    System.out.println(date.plus(period));

    try {
      // why will this line throw an exception ?
      System.out.println(date.plus(duration));
    } catch (UnsupportedTemporalTypeException ex) {
      System.err.println(ex);
    }

    // LocalTime example
    try {
      System.out.println(time.plus(period));
    } catch (UnsupportedTemporalTypeException ex) {
      System.err.println(ex);
    }

    System.out.println(time.plus(duration));

    // LocalDateTime example
    System.out.println(dateTime.plus(period));
    System.out.println(dateTime.plus(duration));

    // ZoneddateTime example
    System.out.println(zonedDateTime.plus(period));
    System.out.println(zonedDateTime.plus(duration));
  }
}
