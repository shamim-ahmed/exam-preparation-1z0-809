package edu.buet.cse.ch04.examples.optional;

import java.util.Optional;

public class OptionalTrial2 {
  public static void main(String... args) {
    Calculator calculator = new Calculator();
    Optional<Double> avg = calculator.average();
    System.out.println(avg.orElse(Double.NaN));
    System.out.println(avg.orElseGet(() -> Math.random()));

    try {
      System.out.println(avg.orElseThrow(() -> new RuntimeException("No average value found")));
    } catch (Exception ex) {
      System.err.println(ex);
    }
  }
}
