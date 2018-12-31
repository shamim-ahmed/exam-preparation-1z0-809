package edu.buet.cse.ch04.examples.stream;

import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTrial3 {
  public static void main(String... args) {
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    System.out.print("Peek output = ");
    // peek does not consume anything from the stream
    List<Integer> valueList = stream.peek(System.out::println).collect(Collectors.toList());

    System.out.println("Printing all values ...");
    System.out.println(valueList);
  }
}
