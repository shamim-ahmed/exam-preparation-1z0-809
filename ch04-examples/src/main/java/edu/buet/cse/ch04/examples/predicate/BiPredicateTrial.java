package edu.buet.cse.ch04.examples.predicate;

import java.util.function.BiPredicate;

public class BiPredicateTrial {
  public static void main(String... args) {
    BiPredicate<String, String> biPred1 = String::startsWith;
    BiPredicate<String, String> biPred2 = (str, prefix) -> str.startsWith(prefix);

    boolean result1 = biPred1.test("abcdef", "ab");
    boolean result2 = biPred2.test("abcdef", "ab");

    System.out.println(result1);
    System.out.println(result2);
  }
}
