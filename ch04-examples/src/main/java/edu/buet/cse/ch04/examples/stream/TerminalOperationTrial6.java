package edu.buet.cse.ch04.examples.stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class TerminalOperationTrial6 {
  public static void main(String... args) {
    // example 1
    IntStream stream1 = IntStream.of(2, 4, 6, 8, 10);
    int result1 = stream1.reduce(0, (n1, n2) -> n1 + n2);
    System.out.println(result1);

    System.out.println();

    // example 2
    LongStream stream2 = LongStream.of(1L, 3L, 5L, 7L, 9L);
    long result2 = stream2.reduce(1, (n1, n2) -> n1 * n2);
    System.out.println(result2);
  }
}
