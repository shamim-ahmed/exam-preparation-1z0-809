package edu.buet.cse.ch04.examples.predicate;

import java.util.function.Predicate;

public class PredicateCompositionTrial {
  public static void main(String... args) {
    String prefix = "abc";

    Predicate<String> pred1 = String::isEmpty;
    Predicate<String> pred2 = (input) -> input.startsWith(prefix);

    // note that we can reuse the variable name !
    String input = "abcdef";

    Predicate<String> pred3 = pred1.negate().and(pred2);
    boolean result = pred3.test(input);
    System.out.println(result);
  }
}
