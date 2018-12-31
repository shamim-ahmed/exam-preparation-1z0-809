package edu.buet.cse.ch04.examples.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class TerminalOperationTrial3 {
  public static void main(String... args) {
    // example 1
    IntStream stream1 = IntStream.of(3, 1, 4, 5, 2, 9, 8, 7);
    OptionalInt result1 = stream1.max();
    System.out.println(result1.orElse(Integer.MAX_VALUE));

    System.out.println();

    // example 2
    IntStream stream2 = IntStream.of(3, 1, 4, 5, 2, 9, 8, 7);
    OptionalInt result2 = stream2.min();
    System.out.println(result2.orElse(Integer.MIN_VALUE));
  }
}
