package edu.buet.cse.ch05;

import java.time.LocalDate;

public class LocalDateArithmetic {
  public static void main(String... args) {
    LocalDate date1 = LocalDate.of(2018, 1, 1);
    System.out.println(date1);

    LocalDate date2 = date1.plusDays(7);
    System.out.println(date2);

    LocalDate date3 = date1.plusMonths(3);
    System.out.println(date3);

    LocalDate date4 = date1.plusYears(5);
    System.out.println(date4);

    LocalDate date5 = date1.minusDays(7);
    System.out.println(date5);

    LocalDate date6 = date1.minusMonths(2);
    System.out.println(date6);

    LocalDate date7 = date1.minusYears(4);
    System.out.println(date7);
  }
}
