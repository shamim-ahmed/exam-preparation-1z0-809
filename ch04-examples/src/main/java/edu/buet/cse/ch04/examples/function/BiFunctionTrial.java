package edu.buet.cse.ch04.examples.function;

import java.util.function.BiFunction;

public class BiFunctionTrial {
  public static void main(String... args) {
    BiFunction<String, String, String> biFunc1 = (String s1, String s2) -> s1.concat(s2);
    BiFunction<String, String, String> biFunc2 = String::concat;

    System.out.println(biFunc1.apply("Hello", " world"));
    System.out.println(biFunc2.apply("Shamim", " Ahmed"));
  }
}
