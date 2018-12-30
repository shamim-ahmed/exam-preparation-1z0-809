package edu.buet.cse.ch05;

import java.time.Duration;

public class DurationTrial2 {
  public static void main(String... args) {
    Duration duration1 = Duration.ofDays(7);
    System.out.println(duration1);

    Duration duration2 = Duration.ofHours(27);
    System.out.println(duration2);

    Duration duration3 = Duration.ofMinutes(69);
    System.out.println(duration3);

    Duration duration4 = Duration.ofSeconds(75);
    System.out.println(duration4);

    Duration duration5 = Duration.ofNanos(1000000099);
    System.out.println(duration5);

    Duration duration6 = Duration.ofMillis(1005);
    System.out.println(duration6);
  }
}
