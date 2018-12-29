package edu.buet.cse.ch05;

import java.time.LocalTime;

public class LocalTimeArithmetic {
  public static void main(String... args) {
    LocalTime time1 = LocalTime.of(17, 53, 45, 999999999);
    System.out.println(time1);

    // addition
    LocalTime time2 = time1.plusHours(8);
    System.out.println(time2);

    LocalTime time3 = time1.plusMinutes(8);
    System.out.println(time3);

    LocalTime time4 = time1.plusSeconds(16);
    System.out.println(time4);

    LocalTime time5 = time1.plusNanos(2);
    System.out.println(time5);

    // subtraction
    LocalTime time6 = time1.minusHours(18);
    System.out.println(time6);

    LocalTime time7 = time1.minusMinutes(54);
    System.out.println(time7);

    LocalTime time8 = time1.minusSeconds(46);
    System.out.println(time8);

    LocalTime time9 = time1.minusNanos(1000000000);
    System.out.println(time9);
  }
}
