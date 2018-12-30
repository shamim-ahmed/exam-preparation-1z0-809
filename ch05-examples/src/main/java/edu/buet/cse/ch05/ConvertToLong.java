package edu.buet.cse.ch05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;

public class ConvertToLong {
  public static void main(String... args) {
    LocalDate date = LocalDate.of(2018, Month.JANUARY, 31);
    long val1 = date.toEpochDay();
    System.out.println(val1);

    LocalTime time = LocalTime.of(16, 30, 30);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    long val2 = dateTime.toEpochSecond(ZoneOffset.UTC);
    System.out.println(val2);
  }
}
