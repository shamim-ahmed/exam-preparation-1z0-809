package edu.buet.cse.ch04.examples.predicate;

import java.util.function.BiPredicate;

public class BiPredicateTrial2 {
  public static void main(String... args) {
    BiPredicate<String, String> biPred1 = (s1, s2) -> !s1.isEmpty() && !s2.isEmpty();
    BiPredicate<String, String> biPred2 = (s1, s2) -> s1.isEmpty() || s2.isEmpty();

    System.out.println(biPred1.test("hello", "world"));
    System.out.println(biPred2.negate().test("hello", "world"));
  }
}
