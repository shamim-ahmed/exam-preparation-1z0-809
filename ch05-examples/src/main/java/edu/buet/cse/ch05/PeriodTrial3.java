package edu.buet.cse.ch05;

import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.UnsupportedTemporalTypeException;

public class PeriodTrial3 {
  public static void main(String... args) {
    LocalTime time = LocalTime.of(12, 30);
    Period period = Period.ofDays(5);

    try {
      LocalTime time2 = time.plus(period);
      System.out.println(time2);
    } catch (UnsupportedTemporalTypeException ex) {
      System.out.println(ex);
    }
  }
}
