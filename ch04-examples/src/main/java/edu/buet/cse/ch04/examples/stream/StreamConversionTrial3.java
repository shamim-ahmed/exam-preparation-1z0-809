package edu.buet.cse.ch04.examples.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamConversionTrial3 {
  public static void main(String... args) {
    DoubleStream stream1 = DoubleStream.of(1.0, 2.5, 3.14, 4.16, 5.25);
    IntStream stream2 = stream1.mapToInt(d -> Double.valueOf(Math.floor(d)).intValue());
    stream2.forEach(System.out::println);
  }
}
