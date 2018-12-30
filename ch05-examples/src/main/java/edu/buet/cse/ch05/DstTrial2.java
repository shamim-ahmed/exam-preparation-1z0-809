package edu.buet.cse.ch05;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DstTrial2 {
  public static void main(String...args) {
    LocalDate date = LocalDate.of(2016, Month.NOVEMBER, 6);
    LocalTime time = LocalTime.of(1, 30);
    ZoneId zoneId = ZoneId.of("US/Eastern");
    
    ZonedDateTime zonedDateTime1 = ZonedDateTime.of(date,  time, zoneId);
    System.out.println(zonedDateTime1);
    
    ZonedDateTime zonedDateTime2 = zonedDateTime1.plusHours(1);
    System.out.println(zonedDateTime2);
  }
}
