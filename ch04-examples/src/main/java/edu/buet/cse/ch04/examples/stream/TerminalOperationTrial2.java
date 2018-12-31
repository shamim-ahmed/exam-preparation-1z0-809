package edu.buet.cse.ch04.examples.stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class TerminalOperationTrial2 {
  public static void main(String... args) {
    // example 1
    LongStream stream1 = LongStream.of(1L, 2L, 3L, 4L, 5L);
    System.out.println(stream1.count());

    System.out.println();

    // example 2
    IntStream stream2 = IntStream.iterate(0, n -> n + 2);
    System.out.println(stream2.limit(10).count());
  }
}
