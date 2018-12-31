package edu.buet.cse.ch05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Question10 {
  public static void main(String...args) {
    LocalDateTime dateTime = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    System.out.println(dateTime.format(formatter));
  }
}
