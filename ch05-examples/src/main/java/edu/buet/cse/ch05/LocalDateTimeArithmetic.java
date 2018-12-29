package edu.buet.cse.ch05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeArithmetic {
  public static void main(String... args) {
    LocalDate date = LocalDate.of(2018, Month.FEBRUARY, 21);
    LocalTime time = LocalTime.of(13, 55, 6);

    LocalDateTime dateTime1 = LocalDateTime.of(date, time);
    System.out.println(dateTime1);

    // addition
    LocalDateTime dateTime2 = dateTime1.plusDays(5);
    System.out.println(dateTime2);

    LocalDateTime dateTime3 = dateTime1.plusMonths(4);
    System.out.println(dateTime3);

    LocalDateTime dateTime4 = dateTime1.plusYears(6);
    System.out.println(dateTime4);

    LocalDateTime dateTime5 = dateTime1.plusHours(12);
    System.out.println(dateTime5);

    LocalDateTime dateTime6 = dateTime1.plusMinutes(6);
    System.out.println(dateTime6);

    LocalDateTime dateTime7 = dateTime1.plusSeconds(55);
    System.out.println(dateTime7);

    // subtraction
    LocalDateTime dateTime8 = dateTime1.minusDays(22);
    System.out.println(dateTime8);

    LocalDateTime dateTime9 = dateTime1.minusMonths(2);
    System.out.println(dateTime9);

    LocalDateTime dateTime10 = dateTime1.minusYears(4);
    System.out.println(dateTime10);

    LocalDateTime dateTime11 = dateTime1.minusHours(14);
    System.out.println(dateTime11);

    LocalDateTime dateTime12 = dateTime1.minusMinutes(56);
    System.out.println(dateTime12);

    LocalDateTime dateTime13 = dateTime1.minusSeconds(7);
    System.out.println(dateTime13);
  }
}
