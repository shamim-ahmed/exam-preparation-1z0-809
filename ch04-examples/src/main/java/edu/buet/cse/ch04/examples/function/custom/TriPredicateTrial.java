package edu.buet.cse.ch04.examples.function.custom;

public class TriPredicateTrial {
  public static void main(String... args) {
    TriPredicate<String, String, String> triPred =
        (s1, s2, s3) -> !s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty();

    System.out.println(triPred.test("Hello", "world", ""));
  }
}
