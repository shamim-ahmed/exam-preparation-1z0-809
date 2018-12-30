package edu.buet.cse.ch05;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantTrial {
  public static void main(String... args) {
    LocalDate date = LocalDate.of(2018, 12, 30);
    LocalTime time = LocalTime.of(15, 30);
    ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, ZoneId.of("Australia/Sydney"));
    Instant instant = zonedDateTime.toInstant();
    
    System.out.println(zonedDateTime);
    System.out.println(instant);
    
    long epochSecond = instant.getEpochSecond();
    System.out.println(epochSecond);
    
    Instant instant2 = Instant.ofEpochSecond(epochSecond);
    System.out.println(instant2);
  }
}
