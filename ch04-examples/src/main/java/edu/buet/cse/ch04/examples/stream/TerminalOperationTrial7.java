package edu.buet.cse.ch04.examples.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationTrial7 {
  public static void main(String... args) {
    // example 1
    Stream<String> stream1 = Stream.of("apple", "orange", "banana");
    Optional<String> result1 = stream1.max((s1, s2) -> s1.compareTo(s2));
    System.out.println(result1.orElse(null));
    result1.ifPresent(System.out::println);

    System.out.println();

    // example 2
    Stream<String> stream2 = Stream.of("apple", "orange", "banana");
    Optional<String> result2 = stream2.min((s1, s2) -> s1.compareTo(s2));
    System.out.println(result2.orElse(null));
    result2.ifPresent(System.out::println);

    System.out.println();

    // example 3
    Stream<String> stream3 = Stream.empty();
    Optional<String> result3 = stream3.max((s1, s2) -> s1.compareTo(s2));
    System.out.println(result3.orElse(null));
    result3.ifPresent(System.out::println);
  }
}
