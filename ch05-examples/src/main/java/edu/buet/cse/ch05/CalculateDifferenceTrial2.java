package edu.buet.cse.ch05;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CalculateDifferenceTrial2 {
  public static void main(String... args) {
    LocalDateTime dateTime1 = LocalDateTime.of(2018, Month.JANUARY, 31, 23, 25, 45);
    LocalDateTime dateTime2 = LocalDateTime.of(2019, Month.DECEMBER, 25, 7, 36, 21);

    long result1 = ChronoUnit.HOURS.between(dateTime1, dateTime2);
    System.out.println(result1);

    long result2 = ChronoUnit.MINUTES.between(dateTime1, dateTime2);
    System.out.println(result2);

    long result3 = ChronoUnit.SECONDS.between(dateTime1, dateTime2);
    System.out.println(result3);

    long result4 = ChronoUnit.MILLIS.between(dateTime1, dateTime2);
    System.out.println(result4);

    long result5 = ChronoUnit.NANOS.between(dateTime1, dateTime2);
    System.out.println(result5);
  }
}
