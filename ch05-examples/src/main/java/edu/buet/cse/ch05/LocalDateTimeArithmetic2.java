package edu.buet.cse.ch05;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeArithmetic2 {
  public static void main(String... args) {
    LocalDate date = LocalDate.of(2015, 1, 31);
    LocalTime time = LocalTime.of(19, 35);
    LocalDateTime originalDateTime = LocalDateTime.of(date, time);

    Duration duration1 = Duration.ofHours(23);
    LocalDateTime dateTime1 = originalDateTime.plus(duration1);
    System.out.println(dateTime1);

    Duration duration2 = Duration.ofMinutes(26);
    LocalDateTime dateTime2 = originalDateTime.plus(duration2);
    System.out.println(dateTime2);

    Duration duration3 = Duration.ofSeconds(42);
    LocalDateTime dateTime3 = originalDateTime.plus(duration3);
    System.out.println(dateTime3);
  }
}
