package edu.buet.cse.ch05;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DstTrial3 {
  public static void main(String... args) {
    LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
    LocalTime time = LocalTime.of(2, 30);
    ZoneId zoneId = ZoneId.of("US/Eastern");

    ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zoneId);
    System.out.println(zonedDateTime);
  }
}
