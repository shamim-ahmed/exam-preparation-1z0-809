package edu.buet.cse.ch04.examples.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamTrial {
  public static void main(String... args) {
    // example 1
    IntStream stream1 = IntStream.of(1, 3, 5);
    stream1.forEach(System.out::println);

    System.out.println();

    // example 2
    DoubleStream stream2 = DoubleStream.of(1.2, 3.4, 5.6, 7.8);
    stream2.forEach(System.out::println);

    System.out.println();

    // example 3
    LongStream stream3 = LongStream.of(1L, 3L, 5L);
    stream3.forEach(System.out::println);
  }
}
