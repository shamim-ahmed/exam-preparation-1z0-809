package edu.buet.cse.ch04.examples.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTrial {
  public static void main(String... args) {
    // example 1
    Stream<Integer> stream1 = Stream.empty();
    Stream<Integer> stream2 = Stream.of(1);
    Stream<Integer> stream3 = Stream.of(1, 2, 3);

    System.out.println(stream1.count());
    System.out.println(stream2.count());
    System.out.println(stream3.count());

    System.out.println();

    // example 2
    // we can guarantee the order
    List<Integer> valueList = Arrays.asList(1, 2, 3);
    Stream<Integer> stream4 = valueList.stream();
    stream4.forEach(System.out::println);

    System.out.println();

    // example 3
    // no guarantee can be given on the order
    // also, note that the same list can be used as the source of multiple streams
    Stream<Integer> stream5 = valueList.parallelStream();
    stream5.forEach(System.out::println);
  }
}
