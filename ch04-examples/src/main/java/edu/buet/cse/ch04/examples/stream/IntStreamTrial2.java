package edu.buet.cse.ch04.examples.stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamTrial2 {
  public static void main(String... args) {
    IntStream stream1 = IntStream.of(1, 2, 3, 4, 5);
    OptionalDouble avg = stream1.average();
    avg.ifPresent(System.out::println);

    IntStream stream2 = IntStream.rangeClosed(1, 5);
    OptionalInt maxValue = stream2.max();
    maxValue.ifPresent(System.out::println);

    IntStream stream3 = IntStream.rangeClosed(1, 5);
    OptionalInt minValue = stream3.min();
    minValue.ifPresent(System.out::println);
  }
}
