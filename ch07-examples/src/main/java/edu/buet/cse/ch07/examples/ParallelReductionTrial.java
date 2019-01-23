package edu.buet.cse.ch07.examples;

import java.util.Arrays;

public class ParallelReductionTrial {
  public static void main(String... args) {
    Integer result = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19).parallelStream().findAny().get();
    System.out.println(result);
  }
}
