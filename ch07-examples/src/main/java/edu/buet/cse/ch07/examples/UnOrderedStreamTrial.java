package edu.buet.cse.ch07.examples;

import java.util.Arrays;
import java.util.stream.Stream;

public class UnOrderedStreamTrial {
  public static void main(String... args) {
    Stream<Integer> stream = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19).stream().unordered();

    // for a serial stream, there is no significant effect on result
    stream.skip(4).limit(2).forEach(System.out::println);
  }
}
