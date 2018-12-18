package edu.buet.cse.ch04.examples.stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationTrial8 {
  public static void main(String... args) {
    // example 1
    Stream<String> stream1 = Stream.of("apple", "orange", "banana");
    Optional<String> result1 = stream1.findAny();
    result1.ifPresent(System.out::println);

    System.out.println();

    // example 2
    Stream<String> stream2 =
        Stream.generate(() -> LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    Optional<String> result2 = stream2.findAny();
    result2.ifPresent(System.out::println);

    System.out.println();

    // example 3
    Stream<String> stream3 =
        Stream.generate(() -> LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    Optional<String> result3 = stream3.findFirst();
    result3.ifPresent(System.out::println);
  }
}
