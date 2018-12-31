package edu.buet.cse.ch04.examples.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamConversionTrial {
  public static void main(String... args) {
    Stream<String> stream1 = Stream.of("apple", "orange", "banana");
    IntStream stream2 = stream1.mapToInt(s -> s.length());
    stream2.forEach(System.out::println);
  }
}
