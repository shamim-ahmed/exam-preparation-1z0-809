package edu.buet.cse.ch04.examples.predicate;

import java.util.function.Predicate;

public class PredicateTrial {
  public static void main(String... args) {
    Predicate<String> pred1 = String::isEmpty;
    Predicate<String> pred2 = s -> s.startsWith("abc");

    boolean result1 = pred1.test("");
    boolean result2 = pred2.test("abde");

    System.out.println(result1);
    System.out.println(result2);
  }
}
