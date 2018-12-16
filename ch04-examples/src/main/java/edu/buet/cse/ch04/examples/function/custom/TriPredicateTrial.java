package edu.buet.cse.ch04.examples.function.custom;

public class TriPredicateTrial {
  public static void main(String... args) {
    TriPredicate<String, String, String> triPred =
        (s1, s2, s3) -> !s1.isBlank() && !s2.isBlank() && !s3.isBlank();

    System.out.println(triPred.test("Hello", "world", ""));
  }
}
