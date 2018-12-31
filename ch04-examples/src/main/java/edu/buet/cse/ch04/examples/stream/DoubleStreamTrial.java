package edu.buet.cse.ch04.examples.stream;

import java.util.stream.DoubleStream;

public class DoubleStreamTrial {
  public static void main(String... args) {
    // example 1
    DoubleStream stream1 = DoubleStream.of(1.0, 1.1, 1.2);
    stream1.forEach(System.out::println);

    System.out.println();

    // example 2
    DoubleStream stream2 = DoubleStream.generate(Math::random);
    stream2.limit(5).forEach(System.out::println);

    System.out.println();

    // example 3
    DoubleStream stream3 = DoubleStream.iterate(1.0, d -> d / 2.0);
    stream3.limit(5).forEach(System.out::println);
  }
}
