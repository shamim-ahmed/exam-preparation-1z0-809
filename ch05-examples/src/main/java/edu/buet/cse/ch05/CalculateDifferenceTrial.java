package edu.buet.cse.ch05;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

public class CalculateDifferenceTrial {
  public static void main(String... args) {
    LocalDate date1 = LocalDate.of(2018, 2, 28);
    LocalDate date2 = LocalDate.of(2019, 12, 1);

    long result1 = ChronoUnit.YEARS.between(date1, date2);
    System.out.println(result1);

    long result2 = ChronoUnit.MONTHS.between(date1, date2);
    System.out.println(result2);

    long result3 = ChronoUnit.MONTHS.between(date2, date1);
    System.out.println(result3);

    long result4 = ChronoUnit.DAYS.between(date1, date2);
    System.out.println(result4);

    try {
      // why will the following statement throw an exception ?
      long result5 = ChronoUnit.HOURS.between(date1, date2);
      System.out.println(result5);
    } catch (UnsupportedTemporalTypeException ex) {
      System.err.println(ex);
    }
  }
}
