package edu.buet.cse.ch07.examples;

import java.util.Arrays;
import java.util.List;

public class IndependentOperationTrial2 {
  public static void main(String... args) {
    List<String> valueList = Arrays.asList("jackal", "lemur", "kangaroo");

    // no order guaranteed
    valueList.parallelStream().map(s -> {
      System.out.println(s); // stateless side effect
      return s.toUpperCase();
    }).forEach(System.out::println);;
  }
}
