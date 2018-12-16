package edu.buet.cse.ch04.examples.function;

import java.util.function.IntFunction;

public class IntFunctionTrial {
  public static void main(String... args) {
    IntFunction<String> func1 = Integer::toString;
    IntFunction<String> func2 = i -> Integer.toString(i);

    System.out.println(func1.apply(25));
    System.out.println(func2.apply(100));
  }
}
