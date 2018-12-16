package edu.buet.cse.ch04.examples.function;

import java.util.function.Function;

public class FunctionTrial2 {
  public static void main(String... args) {
    Function<String, Integer> func1 = String::length;
    Function<String, Integer> func2 = (String s) -> {
      return s.length();
    };

    System.out.println(func1.apply("abcd"));
    System.out.println(func2.apply("pqrstuvwxyz"));
  }
}
