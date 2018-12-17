package edu.buet.cse.ch04.examples.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

// infinite primitive streams
public class PrimitiveStreamTrial2 {
  public static void main(String... args) {
    // example 1
    IntStream stream1 = IntStream.iterate(0, n -> n + 2);
    IntStream stream2 = stream1.limit(5);
    stream2.forEach(System.out::println);

    System.out.println();

    // example 2
    DoubleStream stream3 = DoubleStream.generate(() -> Math.random());
    DoubleStream stream4 = stream3.limit(5);
    stream4.forEach(System.out::println);
  }
}
