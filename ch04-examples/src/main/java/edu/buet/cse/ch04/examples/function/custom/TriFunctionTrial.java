package edu.buet.cse.ch04.examples.function.custom;

public class TriFunctionTrial {
  public static void main(String... args) {
    TriFunction<String, String, String, Integer> triFunc =
        (s1, s2, s3) -> s1.concat(s2).concat(s3).length();

    System.out.println(triFunc.apply("Hello", "World", "Shamim"));
  }
}
