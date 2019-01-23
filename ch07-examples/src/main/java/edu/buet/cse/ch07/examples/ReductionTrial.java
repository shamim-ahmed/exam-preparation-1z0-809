package edu.buet.cse.ch07.examples;

import java.util.Arrays;

public class ReductionTrial {
  public static void main(String... args) {
    String result =
        Arrays.asList('w', 'o', 'l', 'f').stream().reduce("", (c, s) -> c + s, (s1, s2) -> s1 + s2);
    System.out.println(result);
  }
}
