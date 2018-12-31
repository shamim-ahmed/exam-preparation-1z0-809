package edu.buet.cse.ch04.examples.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamTrial {
  public static void main(String... args) {
    Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
    Integer result1 = stream1.reduce(0, (s, n) -> s + n);
    System.out.println(result1);

    IntStream stream2 = IntStream.of(1, 2, 3, 4, 5);
    int result2 = stream2.reduce(0, (s, n) -> s + n);
    System.out.println(result2);

    IntStream stream3 = IntStream.of(1, 2, 3, 4, 5);
    System.out.println(stream3.sum());

    Stream<Integer> stream4 = Stream.of(1, 2, 3, 4, 5);
    System.out.println(stream4.mapToInt((Integer x) -> x.intValue()).sum());
  }
}
