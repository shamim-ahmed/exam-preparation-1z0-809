package edu.buet.cse.ch04.examples.stream;

import java.util.stream.LongStream;

public class LongStreamTrial {
  public static void main(String... args) {
    LongStream stream1 = LongStream.iterate(1L, n -> n + 1L);
    long result = stream1.limit(100).sum();
    System.out.println(result);
  }
}
