package edu.buet.cse.ch05;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Question15 {
  public static void main(String... args) {
    Duration duration1 = Duration.of(1, ChronoUnit.MINUTES);
    Duration duration2 = Duration.ofMinutes(1);
    Duration duration3 = Duration.of(60, ChronoUnit.SECONDS);

    String s1 = duration1.toString();
    String s2 = duration2.toString();
    String s3 = duration3.toString();

    System.out.println(s1.equals(s2));
    System.out.println(s2.equals(s3));
  }
}
