package edu.buet.cse.ch05;

import java.time.Period;

public class PeriodTrial2 {
  public static void main(String... args) {
    Period period1 = Period.of(1, 2, 2);
    System.out.println(period1);

    Period period2 = Period.of(10, 15, 30);
    System.out.println(period2);

    Period period3 = Period.ofDays(45);
    System.out.println(period3);

    Period period4 = Period.ofMonths(15);
    System.out.println(period4);

    Period period5 = Period.ofYears(3);
    System.out.println(period5);
    
    Period period6 = Period.ofWeeks(7);
    System.out.println(period6);
  }
}
