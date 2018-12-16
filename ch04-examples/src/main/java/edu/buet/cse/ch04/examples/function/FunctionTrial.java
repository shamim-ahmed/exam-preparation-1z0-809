package edu.buet.cse.ch04.examples.function;

import java.util.function.Function;

public class FunctionTrial {
  public static void main(String... args) {
    Function<String, Integer> func1 = Integer::parseInt;
    Function<String, Integer> func2 = s -> Integer.parseInt(s);

    System.out.println(func1.apply("123"));
    System.out.println(func2.apply("456"));
  }
}
