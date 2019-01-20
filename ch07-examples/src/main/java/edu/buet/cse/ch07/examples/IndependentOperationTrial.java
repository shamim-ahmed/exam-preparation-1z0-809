package edu.buet.cse.ch07.examples;

import java.util.Arrays;
import java.util.List;

public class IndependentOperationTrial {
  public static void main(String... args) {
    List<String> valueList = Arrays.asList("apple", "orange", "banana");

    // the input strings can be converted to upper case independent of each other
    valueList.parallelStream().map(s -> s.toUpperCase()).forEach(System.out::println);
  }
}
