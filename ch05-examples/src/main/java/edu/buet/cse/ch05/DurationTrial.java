package edu.buet.cse.ch05;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationTrial {
  public static void main(String... args) {
    Duration duration1 = Duration.of(7, ChronoUnit.DAYS);
    System.out.println(duration1);

    Duration duration2 = Duration.of(27, ChronoUnit.HOURS);
    System.out.println(duration2);

    Duration duration3 = Duration.of(69, ChronoUnit.MINUTES);
    System.out.println(duration3);

    Duration duration4 = Duration.of(75, ChronoUnit.SECONDS);
    System.out.println(duration4);

    Duration duration5 = Duration.of(1000000099, ChronoUnit.NANOS);
    System.out.println(duration5);

    Duration duration6 = Duration.of(1005, ChronoUnit.MILLIS);
    System.out.println(duration6);
  }
}
