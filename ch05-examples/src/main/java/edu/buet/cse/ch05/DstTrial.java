package edu.buet.cse.ch05;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DstTrial {
  public static void main(String... args) {
    LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
    LocalTime time = LocalTime.of(1, 30);
    ZoneId zone = ZoneId.of("US/Eastern");

    ZonedDateTime zonedDateTime1 = ZonedDateTime.of(date, time, zone);
    System.out.println(zonedDateTime1);

    ZonedDateTime zonedDateTime2 = zonedDateTime1.plusHours(1);
    System.out.println(zonedDateTime2);
  }
}
