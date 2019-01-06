package edu.buet.cse.ch07.examples;

public class AverageCalculatorTrial {
  public static void main(String... args) {
    double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
    new Thread(new AverageCalculator(values)).start();
  }
}
