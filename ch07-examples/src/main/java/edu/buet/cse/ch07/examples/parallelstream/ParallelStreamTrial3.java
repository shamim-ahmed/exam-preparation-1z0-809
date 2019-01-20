package edu.buet.cse.ch07.examples.parallelstream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamTrial3 {
  public static void main(String... args) {
    List<Integer> valueList = Arrays.asList(2, 3, 5, 7, 11, 13, 17);

    // this is how you can force order while using a parallel stream
    valueList.parallelStream().forEachOrdered(System.out::println);
  }
}
