package edu.buet.cse.ch05;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CalculateDifferenceTrial3 {
  public static void main(String... args) {
    LocalTime time1 = LocalTime.of(7, 36);
    LocalTime time2 = LocalTime.of(19, 25);

    long result1 = ChronoUnit.HOURS.between(time1, time2);
    System.out.println(result1);

    long result2 = ChronoUnit.MINUTES.between(time1, time2);
    System.out.println(result2);

    long result3 = ChronoUnit.SECONDS.between(time1, time2);
    System.out.println(result3);

    long result4 = ChronoUnit.MILLIS.between(time1, time2);
    System.out.println(result4);

    long result5 = ChronoUnit.NANOS.between(time1, time2);
    System.out.println(result5);
  }
}
