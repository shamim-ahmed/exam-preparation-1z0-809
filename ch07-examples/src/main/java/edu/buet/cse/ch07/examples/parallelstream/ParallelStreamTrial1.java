package edu.buet.cse.ch07.examples.parallelstream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamTrial1 {
  public static void main(String...args) {
    Stream<Integer> stream = Arrays.asList(2, 3, 5, 7, 11, 13).stream();
    Stream<Integer> parallelStream = stream.parallel();
    
    // no order is guaranteed
    parallelStream.forEach(System.out::println);
  }
}
