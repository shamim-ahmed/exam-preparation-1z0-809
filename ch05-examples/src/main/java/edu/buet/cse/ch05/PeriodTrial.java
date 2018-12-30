package edu.buet.cse.ch05;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTrial {
  public static void main(String... args) {
    LocalDate start = LocalDate.of(2018, Month.APRIL, 1);
    LocalDate end = LocalDate.of(2018, Month.JULY, 30);
    foo(start, end, Period.ofMonths(1));
  }

  private static void foo(final LocalDate start, final LocalDate end, Period period) {
    LocalDate temp = start;
    
    // note the method being used for comparison
    while (temp.isBefore(end)) {
      System.out.println(temp);
      temp = temp.plus(period);
    }
  }
}
