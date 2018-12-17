package edu.buet.cse.ch04.examples.stream;

import java.util.stream.Stream;

// demo involving infinite streams
public class StreamTrial2 {
  public static void main(String... args) {
    // example 1
    Stream<Double> stream1 = Stream.generate(() -> Math.random());
    Stream<Double> stream2 = stream1.limit(5);
    stream2.forEach(System.out::println);

    System.out.println();

    // example 2
    Stream<Integer> stream3 = Stream.iterate(0, n -> n + 2);
    Stream<Integer> stream4 = stream3.limit(10);
    stream4.forEach(System.out::println);
  }
}
