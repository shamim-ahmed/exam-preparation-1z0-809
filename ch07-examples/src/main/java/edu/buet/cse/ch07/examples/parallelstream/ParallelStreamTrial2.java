package edu.buet.cse.ch07.examples.parallelstream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamTrial2 {
  public static void main(String... args) {
    Stream<Integer> stream = Arrays.asList(2, 3, 5, 7, 11, 13).parallelStream();

    stream.forEach(System.out::println);

    // is the stream parallel ?
    System.out.println(stream.isParallel());
  }
}
