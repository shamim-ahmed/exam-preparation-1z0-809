package edu.buet.cse.ch04.examples.optional;

import java.util.Optional;

public class Calculator {
  public Optional<Double> average(int... values) {
    if (values.length == 0) {
      return Optional.empty();
    }

    int sum = 0;

    for (int n : values) {
      sum += n;
    }

    return Optional.of((double) sum / values.length);
  }

  public static void main(String... args) {
    Calculator calc = new Calculator();
    Optional<Double> avg = calc.average(1, 2, 3, 4, 5);

    if (!avg.isPresent()) {
      System.out.println(avg.get());
    } else {
      System.out.println("No input provided");
    }
  }
}
