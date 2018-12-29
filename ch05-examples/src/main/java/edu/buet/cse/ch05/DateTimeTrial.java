package edu.buet.cse.ch05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeTrial {
  public static void main(String... args) {
    // usage of static now() method
    LocalDate date1 = LocalDate.now();
    LocalTime time1 = LocalTime.now();
    LocalDateTime dateTime1 = LocalDateTime.now();
    ZonedDateTime zonedDateTime1 = ZonedDateTime.now();

    System.out.println(date1);
    System.out.println(time1);
    System.out.println(dateTime1);
    System.out.println(zonedDateTime1);

    System.out.println();

    // usage of static of() method
    LocalDate date2 = LocalDate.of(2018, Month.JANUARY, 12);
    LocalTime time2 = LocalTime.of(1, 12, 30);
    LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);

    ZoneId gmtZoneId = ZoneId.of("GMT");
    ZonedDateTime zonedDateTime2 = ZonedDateTime.of(date2, time2, gmtZoneId);

    System.out.println(date2);
    System.out.println(time2);
    System.out.println(dateTime2);
    System.out.println(zonedDateTime2);
  }
}
