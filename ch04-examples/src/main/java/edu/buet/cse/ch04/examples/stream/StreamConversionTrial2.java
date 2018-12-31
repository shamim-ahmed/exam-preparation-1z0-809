package edu.buet.cse.ch04.examples.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamConversionTrial2 {
  public static void main(String... args) {
    IntStream stream1 = IntStream.of(1, 2, 3, 4, 5);
    DoubleStream stream2 = stream1.mapToDouble(n -> Integer.valueOf(n).doubleValue());
    stream2.forEach(System.out::println);
  }
}
