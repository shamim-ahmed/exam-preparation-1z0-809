package edu.buet.cse.ch04.examples.stream;

import java.util.stream.IntStream;

public class TerminalOperationTrial5 {
  public static void main(String... args) {
    // example 1
    IntStream stream1 = IntStream.of(2, 4, 6, 8, 10);
    boolean result1 = stream1.anyMatch(n -> n % 2 == 1);
    System.out.println(result1);

    System.out.println();

    // example 2
    IntStream stream2 = IntStream.of(2, 4, 6, 8, 10);
    boolean result2 = stream2.allMatch(n -> n % 2 == 0);
    System.out.println(result2);
  }
}
